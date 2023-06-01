package day0216.collection.list;

import java.util.*;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}

	// 회원 추가
	public void addMember(Member mem) {
		arrayList.add(mem);
		System.out.println(mem.getMid() + "회원 추가");
	}

	// 회원 삭제
	public boolean removeMember(int mid) {
		for (int i = 0; i < arrayList.size(); i++) {
			Member m = arrayList.get(i); // arrayList의 멤버는 get 메서드로 추출
			int memberid = m.getMid(); // 회원의 아이디 추출
			if (memberid == mid) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(mid + "회원은 존재하지 않습니다.");
		return false;
	} // 리스트는 저장된 데이터의 사이즈만큼만 반복한다.
		// cf ) 배열에는 기본값이 있어 저장된 데이터가 아니라 배열의 전체 길이만큼 반복된다.

	// 전체 회원 list 보여주기
	public void showAllMember() {
		System.out.println("------------회원명단-------------");
		for (Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println("-------------------------------");
	}

}
