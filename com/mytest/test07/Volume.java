package com.mytest.test07;

public interface Volume {

	// 인터페이스에 선언하는 순간 상수가 되며, 다른 메서드에서 변경이 불가능하다.

	public void volumeUp(int level);

	public void volumeDown(int level);

}
