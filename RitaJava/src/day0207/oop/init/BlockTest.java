package day0207.oop.init;

public class BlockTest {
	
	static {
		System.out.println("static{}");
	}
	
	{System.out.println("{}");}
	
	BlockTest(){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		BlockTest bt = new BlockTest();
		BlockTest bt1 = new BlockTest();
	}

}
