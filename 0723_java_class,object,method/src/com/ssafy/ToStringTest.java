package com.ssafy;

public class ToStringTest {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		
		phone.setName("Galaxy Note");
		phone.setColor('B');
		phone.setPrice(10000);
		
		System.out.println(phone);

	}

}