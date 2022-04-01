package com.tns.oops_concepts;

public class Constructor {
	String str;
	int a;
	Constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor("Rakesh",23);
		c.display();
	}

}
