package day0216.collection.list;

public class MemberArrayListTest {

	public static void main(String[] args) {

		Member m1 = new Member(1001, "김자바");
		Member m2 = new Member(1002, "이자바");
		Member m3 = new Member(1003, "강자바");
		Member m4 = new Member(1004, "홍자바");

		MemberArrayList mlist = new MemberArrayList();

		mlist.addMember(m1);
		mlist.addMember(m4);
		mlist.addMember(m2);
		mlist.addMember(m3);

		mlist.showAllMember();

		mlist.removeMember(m2.getMid());
		mlist.showAllMember();

		mlist.removeMember(1005);
		mlist.showAllMember();

	}

}
