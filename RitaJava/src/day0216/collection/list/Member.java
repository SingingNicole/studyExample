package day0216.collection.list;

public class Member {

	private int mid;
	private String name;

	public Member(int mid, String name) {
		this.mid = mid;
		this.name = name;
	}

	public int getMid() {
		return mid;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + "]";
	}

}
