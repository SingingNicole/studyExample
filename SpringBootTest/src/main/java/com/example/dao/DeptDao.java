package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.dto.Dept;

@Mapper
public interface DeptDao {
	// 태그의 id값과 메서드의 이름을 일치시켜 mapping한다(자동으로 오버라이딩).
	@Select("select * from dept order by deptno")	// 어노테이션으로 sql문을 지정할 수도 있다.
	public List<Dept> deptAll(); 	// 레코드의 값이 Dept에 저장되며, 리턴된 복수 객체들을 List에 저장하는 추상 메서드이다.
	
	public Dept allDeptno(int deptno);
	
	// insert, update, delete의 리턴타입은 int이다.
	
	@Insert("insert into dept (deptno, dname, loc) values(#{deptno}, #{dname}, #{loc})")
	public int addDept(Dept dept);	// 변경된 레코드의 개수를 return

	public int newDeptno();
	
	public int updateDept(Dept dept);
	
	@Delete("delete from dept where deptno = #{deptno}")
	public int deleteDept(int deptno);

	public List<Dept> searchDept(String dname);

}
