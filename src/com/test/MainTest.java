package com.test;

import com.dto.Java;

public class MainTest {

	public static void main(String[] args) {
		Java java = new Java();
		System.out.println(java);
		// java.setFiyati(Math.abs(-400));
		java.setFiyati(-400);

		System.out.println(java.getFiyati());
	}

}
