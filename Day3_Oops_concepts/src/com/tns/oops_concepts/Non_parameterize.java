package com.tns.oops_concepts;

public class Non_parameterize {
	String str;
	int a;
	Non_parameterize()
	{
		str="Rakesh";
		a=101;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_parameterize c=new Non_parameterize();
		c.display();
	}

}
