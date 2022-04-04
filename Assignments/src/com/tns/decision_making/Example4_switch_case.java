package com.tns.decision_making;

import java.util.Scanner;

public class Example4_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Soujan");
			case 2:
				System.out.println("Hello");
				break;
			case 3:
				System.out.println("Rita");
				break;
			case 4:
				System.out.println("James");
				break;
			default:
				System.out.print("Invalid data");
s.close();		}
	}

}
