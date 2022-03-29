package com.tns.sample;

public class Sample2 {

	public static void main(String[] args) {
		int a=30, b=40;
		System.out.println("Before swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: "+a+" "+b);
	}

}
