package com.tns.looping;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int y=1;y<=n;y++)
		System.out.println("Value of y:" + y);
		s.close();
	}

}
