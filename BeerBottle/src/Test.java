
public class Test {

	int a,b;
	Test(int a , int b)
	{
		this.a = a;
		this.b = b;
			
	}
	
	void disp(Test x1, Test x2)
	{
		System.out.println("value of a of t1 = " + this.a);
		System.out.println("value of a of t1 = " + this.b);
		System.out.println("value of a of t2 = " + x1.a);
		System.out.println("value of a of t2 = " + x1.b);
		System.out.println("value of a of t3 = " + x2.a);
		System.out.println("value of a of t3 = " + x2.b);
		
	}
}
