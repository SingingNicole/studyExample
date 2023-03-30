package day0310.jdbc.dept;

// DTO: DEPT 테이블의 레코드를 저장할 목적으로 제작.
// 테이블에 맞추어 레코드 작성
public class DeptDTO {
	// 컬럼과 변수를 일치시킨다.
	private int deptno;
	private String dname;
	private String loc;

	public DeptDTO() {
	}

	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	// 캡슐화 패턴 진행

}
