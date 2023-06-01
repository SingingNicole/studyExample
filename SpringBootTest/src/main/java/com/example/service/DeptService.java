package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DeptDao;
import com.example.dto.Dept;

@Service
public class DeptService {
	@Autowired
	DeptDao dao;	// dao 객체 주입
	
	public List<Dept> deptAll() {	// 컨테이너가 service의 객체를 받을 수 있도록 한다.
		return dao.deptAll();
	}

	public int newDeptno() {
		return dao.newDeptno();
	}
	
	// view로 갈 필요가 없다면 굳이 return 의무가 없어 void 메서드로 만든다.

	public int addDept(Dept dept) {
		int x = dao.addDept(dept);
		return x;
	}
	
	public void updateDept(Dept dept) {
		dao.updateDept(dept);
	}
	
	public void deleteDept(int deptno) {
		dao.deleteDept(deptno);
	}
	
	public List<Dept> searchDept(String dname) {
		return dao.searchDept(dname);
	}
	
}
