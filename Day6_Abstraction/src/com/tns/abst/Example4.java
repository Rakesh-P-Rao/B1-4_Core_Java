package com.tns.abst;

class A
{
	String name="Rakesh";
}
class B extends A
{
	String name="Rocky";
	void print()
	{
		System.out.println("Hi i am "+name);
		System.out.println("Hi i am "+super.name);
	}
}

public class Example4 {

	public static void main(String[] args) {
		{
			B b=new B();
			b.print();
		}

	}

}