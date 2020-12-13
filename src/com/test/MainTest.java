package com.test;

import com.dto.JavaDto;

public class MainTest {

	public static void main(String[] args) {
		JavaDto java = new JavaDto();
		System.out.println(java);
		// java.setFiyati(Math.abs(-400));
		java.setFiyati(-400);

		System.out.println(java.getFiyati());
	}

}
