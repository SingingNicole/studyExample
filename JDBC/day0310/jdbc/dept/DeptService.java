package day0310.jdbc.dept;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class DeptService {

	DeptDAO dao = new DeptDAO();

	@SuppressWarnings("resource")
	public void deptOne(Connection conn) {
		System.out.print("부서 번호를 입력하세요. > ");
		Scanner scanner = new Scanner(System.in);
		int deptno = scanner.nextInt();
		DeptDTO dto = dao.deptOne(conn, deptno);
		if (dto == null) {
			System.out.println("입력하신 부서는 존재하지 않습니다.");
		} else {
			System.out.println(dto);
		}

		System.out.println("==========END==========\n");
	}

	public void DeptAll(Connection conn) {
		List<DeptDTO> dlist = dao.deptAll(conn);
		System.out.println("전체 부서 정보");
		for (DeptDTO dept : dlist) {
			System.out.println(dept);
		}
		System.out.println("==========END==========\n");
	}

	@SuppressWarnings("resource")
	public void searchDept(Connection conn) {

		System.out.print("부서명을 입력하세요. > ");
		Scanner scanner = new Scanner(System.in);
		String dname = scanner.next();
		List<DeptDTO> dlist = dao.searchDept(conn, dname);

		if (dlist.size() == 0) {
			System.out.println("입력하신 부서는 존재하지 않습니다.");
		} else {
			for (DeptDTO dept : dlist) {
				System.out.println(dept);
			}
		}

		System.out.println("==========END==========\n");

	}

	@SuppressWarnings("resource")
	public void addDept(Connection conn) {
		// DAO 메소드 실행
		System.out.println("새로운 부서를 추가합니다.");
		int no = dao.getNewNo(conn);
		Scanner scanner = new Scanner(System.in);
		System.out.print("부서명 > ");
		String dname = scanner.next();
		System.out.print("근무지 > ");
		String loc = scanner.next();

		DeptDTO dto = new DeptDTO(no, dname, loc);
		int i = dao.addDept(conn, dto);
		if (i != 0) {
			System.out.println("부서 입력 완료");
		}
	}

	@SuppressWarnings("resource")
	public void updateDept(Connection conn) {
		System.out.println("부서의 이름을 변경합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 부서의 번호를 입력하세요 > ");
		int deptno = sc.nextInt();
		System.out.print("변경할 부서명 > ");
		String dname = sc.next();

		int i = dao.updateDept(conn, deptno, dname);
		if (i != 0) {
			System.out.printf("부서명이 %s로 수정되었습니다.\n", dname);
		} else {
			System.out.println("부서 번호가 잘못되었습니다.");
		}
	}

	@SuppressWarnings("resource")
	public void deleteDept(Connection conn) {
		System.out.println("부서를 삭제합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 부서의 번호를 입력하세요 > ");
		int deptno = sc.nextInt();
		System.out.print("삭제할 부서의 부서명을 입력하세요 > ");
		String dname = sc.next();
		DeptDTO dto = new DeptDTO(deptno, dname, null);

		int i = dao.deleteDept(conn, dto);
		if (i != 0) {
			System.out.println(dname + " 부서가 삭제되었습니다.");
		} else {
			System.out.println("부서번호나 부서명이 틀렸습니다.");
		}
	}

} // main end
