package com.abhikdutta.patterns.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = DateUtil.getInstance();
		
		System.out.println(dateUtil1==dateUtil2);

	}

}
