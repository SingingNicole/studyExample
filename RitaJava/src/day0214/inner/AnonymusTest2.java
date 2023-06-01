package day0214.inner;

public class AnonymusTest2 {
	Object iv = new Object();
	{
	};
	static Object cv = new Object() {

		void method() {
		}
	};

	void method() {
		Object lv = new Object() {
		};
	}

}
