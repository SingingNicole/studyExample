package com.example.scott.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scott.dao.EmpDao;
import com.example.scott.dto.Emp;

@Service
public class EmpService {
	@Autowired
	EmpDao dao;

	public List<Map<String, Object>> getDeptInfo() {
		return dao.getDeptInfo();
	}

	public List<Map<String, Object>> getEmpInfo(int deptno){
		return dao.getEmpInfo(deptno);
	}

	public Emp getPersonalInfo(int empno) {
		return dao.getPersonalInfo(empno);
	}
	
	public List<Map<String, Object>> names(String ename) {
		return dao.names(ename);
	}

}
