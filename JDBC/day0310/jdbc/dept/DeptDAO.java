package day0310.jdbc.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	// select * from dept rs -> 자바 객체 select: 여러 줄, 컬럼 여러 개 -> List<DTO>
	// DTO 객체 여러개를 모아 리스트 작성
	// 모든 컬럼을 가지고 온다면 DTO, 외에 where 절
	// 수행할 SQL문마다 메서드를 선언해야 한다.

	public List<DeptDTO> deptAll(Connection conn) {
		List<DeptDTO> dlist = new ArrayList<>();

		String sql = "select * from dept";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			ResultSet rs = pstmt.executeQuery(); // 전부 출력이라 값 세팅 필요X
			// rs의 값을 한 줄씩 DTO에 저장해야 한다.
			while (rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));

				dlist.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dlist;
	} // deptAll end

	// select * from dept where deptno = ? => 스캐너로 입력 받은 부서 정보 출력하기
	public DeptDTO deptOne(Connection conn, int deptno) {
		DeptDTO dto = null; // 타입에 맞추어 리턴 타입 지정
		String sql = "select * from dept where deptno = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, deptno);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dto;
	}

	// searchDept: 스캐너로 부서명의 일부를 입력하면 해당 부서의 정보를 가져와서 출력하는 메서드
	public List<DeptDTO> searchDept(Connection conn, String dname) {
		List<DeptDTO> dlist = new ArrayList<>();
		String sql = "select * from dept where dname like ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "%" + dname + "%");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				dlist.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dlist;
	}

	/*
	 * 부서 추가 addDept => update 부서번호: 제일 마지막 부서번호(select) + 10 set deptno 부서명:
	 * "IT"(스캐너 입력) set dname 근무지: "SEOUL"(스캐너 입력) set loc => DTO에 저장 DAO ->
	 * getNewNO: select -> addDept: insert service -> addDept
	 */
	public int getNewNo(Connection conn) { // 부서번호를 가져 오는 클래스
		int no = 0;
		String sql = "select max(deptno) + 10 from dept";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				no = rs.getInt(1); // 인덱스를 활용하여 값 가져오기.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return no;
	}

	public int addDept(Connection conn, DeptDTO dto) { // 데이터 입력 클래스 => int 값 리턴
		int i = 0;

		String sql = "insert into dept values(?, ?, ?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());

			i = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

	/*
	 * updateDept, 스캐너로 부서번호 - 50 수정할 부서명 - IT&PRO
	 */

	public int updateDept(Connection conn, int deptno, String dname) {
		int i = 0;
		String sql = "update dept set dname = ? where deptno = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);

			i = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	// deletedept: 부서명과 부서번호가 일치하면 삭제
	public int deleteDept(Connection conn, DeptDTO dto) {
		int i = 0;
		String sql = "delete from dept where deptno = ? and dname = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());

			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

} // class 끝
