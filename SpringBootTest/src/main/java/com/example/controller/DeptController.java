package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.Dept;
import com.example.service.DeptService;

@Controller
public class DeptController {
	@Autowired
	DeptService dservice;	// 구현된 추상 메서드 객체를 주입받음.

	@GetMapping("/deptAll")
	public String deptAll(Model m) {	// view 경로를 return
		List<Dept> dList = dservice.deptAll();
		m.addAttribute("deptAll", dList);
		return "dept/deptAll";
	}
	
	@GetMapping("/add")
	public String form(Model m) {
		int newDeptno = dservice.newDeptno();
		m.addAttribute("newDeptno", newDeptno);
		return "dept/form";
	}
	
	@PostMapping("/add")
	public String add(Dept dept, Model m) {
		int x = dservice.addDept(dept);

		if (x == 0) {
			m.addAttribute("msg", "부서 정보가 입력되지 않았습니다.");
		}
		return "dept/addresult";
	}
	
	@GetMapping("/update/{deptno}")	// rest 방식으로는 url이 길어 질 수 있음.
	public String updateform(@PathVariable int deptno, Model m) {
		m.addAttribute("deptno", deptno);
		return "dept/updateform";
	}
	
	@PutMapping("/update")
	public String update(Dept dept) {
		dservice.updateDept(dept);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{deptno}")
	public String delete(@PathVariable int deptno) {
		dservice.deleteDept(deptno);
		return "redirect:/";
	}
	
	@GetMapping("/search")
	public String searchForm() {
		return "dept/searchForm";
	}

	@PostMapping("/search")
	public String search(String dname, Model m) {
		m.addAttribute("searchValue", dname);
		List<Dept> resultList =  dservice.searchDept(dname);	// !!받아 온 값은 반드시 저장해야 한다!!!!!!!!!!!!
		m.addAttribute("result", resultList);	// !!result라는 이름 사용, list 저장
		
		m.addAttribute("size", resultList.size());	// 저장된 값(검색 결과)이 있는지 확인할 용도.

		return "dept/search";
	}

}
