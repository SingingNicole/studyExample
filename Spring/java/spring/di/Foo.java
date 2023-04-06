package spring.di;

public class Foo {

	Bar bar;
	Baz baz;
	int count;
	String str;
	
	public Foo() {
	}

	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}

	public Foo(Bar bar, Baz baz, int count, String str) {
		System.out.println("int String");
		this.bar = bar;
		this.baz = baz;
		this.count = count;
		this.str = str;
	}
	
	public Foo(Bar bar, Baz baz, String count, String str) {
		System.out.println("String String");
		this.bar = bar;
		this.baz = baz;
		this.str = str;
	}

	public void doFoo() {
		System.out.println("Foo.doFoo() 실행.");
		System.out.println(count + " " + str);
		bar.doBar();
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
