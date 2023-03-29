package com.mytest.test07;

public class Radio implements Volume {

	private int volLevel;

	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("Radio 볼륨 올립니다." + volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("Radio 볼륨 내립니다." + volLevel);
	}

}
