package board.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import board.member.dto.MemDto;
import board.member.service.MemService;

@Controller
@SessionAttributes("user")
public class MemController {
	@Autowired
	MemService service;

	@ModelAttribute("user")
	public MemDto getDto() {
		return new MemDto();
	}	// 로그인이 되지 않은 상태라면 항상 비어 있는 dto 객체가 만들어진다.

	@GetMapping("/insert")
	public String joinform() {
		return "mem/joinform";
	}

	@GetMapping("/idCheck")
	@ResponseBody
	public String idCheck(String id) {
		String checkid = service.idCheck(id);
		return checkid;	// text return
		// null이거나 값이 있거나 둘 중 하나.
		// ajax로 검사한다.
	}

	@PostMapping("/insert")
	public String insert(MemDto dto) {
		service.insertMem(dto);
		return "redirect:login";
	}	// 중복 확인 후 insert 실행

	@GetMapping("/login")
	public String loginform() {
		return "mem/loginform";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("command") @Validated MemDto dto,
			BindingResult error, Model m) {
		MemDto resultDto = service.login(dto);
		if (resultDto == null) {
			error.reject("nocode", "로그인 실패: 아이디나 비밀번호가 틀림.");
			return "mem/loginform";
		} else {
			m.addAttribute("user", resultDto);
		}
		return "redirect:/main";
	}

	@GetMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();	// 기존 user dto 객체 삭제
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public String updateform() {
		return "mem/updateform";
	}
	
	@PutMapping("/update")
	public String update(@ModelAttribute("user") MemDto dto) {
		service.updateMem(dto);
		return "redirect:/main";
	}
	
	@GetMapping("/delete")
	public String deleteform(String result, Model m) {
		m.addAttribute("result", result);
		return "mem/deleteform";
	}
	
	@DeleteMapping("/delete")
	public String delete(String formpw, @ModelAttribute("user") MemDto dto,
			SessionStatus status) {
		int i = service.deleteMem(formpw, dto);
		if (i == 0) {
			return "redirect:/delete?result=false";
		} else {
			status.setComplete();
			return "redirect:/main";
		}
	}

	@RequestMapping("/main")
	public String main(@ModelAttribute("user") MemDto dto) {
		if (dto.getId() != null) {
			return "mem/main";
		} else {
			return "mem/loginform";
		}
	}

}
