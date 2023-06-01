package board.member.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class FileUploadController {
	@RequestMapping(value = "smarteditorMultiImageUpload")
	public void smarteditorMultiImageUpload(HttpServletRequest request, HttpServletResponse response) {
		try {
			String sFileInfo = "";
			String sFilename = request.getHeader("file-name");
			String sFilenameExt = sFilename.substring(sFilename.lastIndexOf(".") + 1);
			sFilenameExt = sFilenameExt.toLowerCase();
			
			String[] allowFileArr = {"jpg", "png", "bmp", "gif"};
			
			int nCnt = 0;
			for(int i = 0; i < allowFileArr.length; i++) {
				if (sFilenameExt.equals(allowFileArr[i])) {
					nCnt++;
				}
			}
			
			if (nCnt == 0) {
				PrintWriter print = response.getWriter();
				print.print("NOTALLOW_" + sFilename);
				print.flush();
				print.close();
			} else {
				String filePath = request.getServletContext().getRealPath("/smarteditor/boardImg");
				File file = new File(filePath);
				
				if(!file.exists()) {
					file.mkdirs();
				}
				
				String sRealFileNm = "";
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
				String today = formatter.format(new java.util.Date());
				sRealFileNm = today + UUID.randomUUID().toString() + sFilename.substring(sFilename.lastIndexOf("."));
				String rlFileNm = filePath + sRealFileNm;
				
				InputStream inputStream = request.getInputStream();
				OutputStream outputStream = new FileOutputStream(rlFileNm);
				
				int numRead;
				byte bytes[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
				while((numRead = inputStream.read(bytes, 0, bytes.length)) != -1) {
					outputStream.write(bytes, 0, numRead);
				}
				if(inputStream != null) {
					inputStream.close();
				}
				outputStream.flush();
				outputStream.close();
				
				sFileInfo += "&bNewLine=true";
				sFileInfo += "&sFileName=" + sFilename;
				sFileInfo += "&sFileURL=" + "/smarteditor/boardImg" + sRealFileNm;
				
				PrintWriter printWriter = response.getWriter();
				printWriter.print(sFileInfo);
				printWriter.flush();
				printWriter.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
