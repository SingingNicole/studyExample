package board.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import board.member.dto.CommDto;
import board.member.service.CommService;

@Controller
public class CommController {
	@Autowired
	CommService service;
	
	@GetMapping("/comm/insert")
	@ResponseBody
	public String insertComm(CommDto dto) {
		service.insertComm(dto);
		List<CommDto> cList = service.selectComm(dto.getNo());

		Gson gson = new Gson();
		return gson.toJson(cList);
	}
	
	@GetMapping("/comm/delete/{cno}")
	@ResponseBody
	public String deleteComm(@PathVariable int cno) {
		int i = service.deleteComm(cno);
		return i + "";
	}
}
