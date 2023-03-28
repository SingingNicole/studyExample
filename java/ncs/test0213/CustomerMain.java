package ncs.test0213;

public class CustomerMain {

	public static void main(String[] args) {
		Customer b = new Customer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		
		b.order(nd);
		b.order(rc);

		System.out.println(nd.getName() + "을/를 주문하셨습니다.");
		System.out.println(rc.getName() + "을/를 주문하셨습니다.");
		System.out.println(b.toString());
	}

}
