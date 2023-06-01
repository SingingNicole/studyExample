package com.example.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.dto.FileinfoDto;
import com.example.service.FileinfoService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class UploadController {
	@Autowired
	FileinfoService service;

	@GetMapping("/filedownload/{fileid}")
	public void fileDownload(@PathVariable("fileid") int id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		FileinfoDto dto = service.fileOne(id);
		String path = null;
		path = request.getServletContext().getRealPath("/mainImg");
		File file = new File(path, dto.getPath());

		String fileName = new String(dto.getName().getBytes("utf-8"), "iso-8859-1");

		response.setContentType("application/octet-stream; charset=utf-8");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\";"); // 다운로드 받을 파일명 지정

		response.setHeader("Content-Transfer-Encoding", "binary");

		OutputStream out = response.getOutputStream();

		FileInputStream fis = null;

		try {

			fis = new FileInputStream(file);
			FileCopyUtils.copy(fis, out);

		} finally {

			if (fis != null) {
				try {

					fis.close();

				} catch (IOException ex) {

				}
			}
		}
		out.flush();
	}

	@GetMapping("/list")
	public String list(Model m) {
		List<FileinfoDto> fList = service.fileList();
		m.addAttribute("fList", fList);
		return "file/list";
	}

	@GetMapping("/upload")
	public String form() {
		return "file/fileform";
	}

	@PostMapping("/upload")
	public String submit(String description, MultipartFile file, Model m, HttpServletRequest request) {

		if (!file.getOriginalFilename().equals("")) {	// form이 존재하기 때문에 파일의 이름으로 검사한다.
			// 이름 없는 파일 검사 => 파일 이름이 공백이 아닐 경우 수행할 문장.
			String fileName = upload(file, request);

			FileinfoDto dto = new FileinfoDto();
			dto.setName(file.getOriginalFilename());
			dto.setPath(fileName);
			dto.setFilesize(file.getSize());
			dto.setDescription(description);	// description 추가(선택)

			service.insertFile(dto);

			m.addAttribute("dto", dto);
		}

		return "file/result";
	}

	private String upload(MultipartFile file, HttpServletRequest request) {
		String origName = file.getOriginalFilename();
		int index = origName.lastIndexOf(".");
		String ext = origName.substring(index + 1);	// 파일 확장자 저장

		Random r = new Random();
		String fileName = System.currentTimeMillis() + "_" + r.nextInt(50) + "." + ext;	// 이름 중복 방지 => 날짜값과 랜덤값 추가.

		try {

			String path = request.getServletContext().getRealPath("/mainImg");	// webapp 폴더에 파일 저장.
			File f = new File(path, fileName);
			file.transferTo(f);

		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return fileName;
	}

	@GetMapping("/deleteFile/{fileid}")
	public String deleteFile(@PathVariable("fileid") int id, HttpServletRequest request) {
		
		FileinfoDto dto = service.fileOne(id);
		String path = null;
		path = request.getServletContext().getRealPath("/mainImg");
		File file = new File(path, dto.getPath());
		
		if(file.exists()) {
			file.delete();	// 업로드 된 파일 삭제
		}

		service.deleteFile(id);

		return "redirect:/list";
	}

}
