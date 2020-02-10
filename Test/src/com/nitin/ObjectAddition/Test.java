package com.nitin.ObjectAddition;

public class Test {
	int a,b;
	Test()
	{
		a=b=0;
	}
	
	Test(int a , int b)
	{
		this.a = a;
		this.b = b;
		
	}
	
	Test sum(Test x)
	{
		Test t = new Test();
		t.a = this.a + x.a;
		t.b = this.b + x.b;
		return t;
	}

	void display()
	{
		System.out.println("value of a:" + a);
		System.out.println("value of b:" + b);
	}
}
