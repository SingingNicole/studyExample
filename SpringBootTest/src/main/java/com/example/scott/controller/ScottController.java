package com.example.scott.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.scott.dto.Emp;
import com.example.scott.service.EmpService;
import com.google.gson.Gson;

@Controller
public class ScottController {
	@Autowired
	EmpService eService;

	@GetMapping("/selectdept")
	public String deptInfo(Model m) {

		List<Map<String, Object>> myDept = eService.getDeptInfo();

		m.addAttribute("myDept", myDept);

		return "scott/emp";
	}

	@GetMapping("/emps/{deptno}")
	public @ResponseBody String emps(@PathVariable int deptno) {

		List<Map<String, Object>> myEmp = eService.getEmpInfo(deptno);

		Gson g = new Gson();
		String eJson = g.toJson(myEmp);

		// System.out.println(eJson); Map은 객체, List는 배열(obj)로 바뀐 것을 알 수 있다.
		return eJson;
	}	// json으로 바꾸는 작업은 restcontroller 클래스를 만들어 활용해도 된다.
	
	@GetMapping("/emp/{empno}")
	public @ResponseBody String emp(@PathVariable int empno) {
		Emp p = eService.getPersonalInfo(empno);

		Gson g2 = new Gson();
		String pJson = g2.toJson(p);

		// System.out.println(pJson);
		return pJson;
	}
	
	@GetMapping("/searchname")
	public String nameform() {
		return "scott/nameform";
	}
	
	@PostMapping("/searchname")
	public String names(String ename, Model m) {
		List<Map<String, Object>> names = eService.names(ename);
		m.addAttribute("names", names);
		m.addAttribute("ename", ename);
		m.addAttribute("size", names.size());
		return "scott/names";
	}

}
