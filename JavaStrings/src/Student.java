public class Student
{
	int rollNo;
	String name;
	
	public Student(String name , int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
//	public boolean equals(Object obj) ------------   Method 1
//	{
//		try
//		{
//			String name1 = this.name;
//			int rollNo1 = this.rollNo;
//			Student s = (Student)obj;
//			String name2 = s.name;
//			int rollNo2 = s.rollNo;
//			if(name1.equals(name2) && rollNo1== rollNo2)
//			{
//				return true;
//			}
//			else {
//			return false;
//			}
//		}
//		catch(ClassCastException e)
//		{
//		return false;
//		}
//		catch(NullPointerException e)
//		{
//			return false;
//		}
//	}
	
	// or simplified way is:
	
//	public boolean equals(Object obj)--------------------Method 2
//	{
//		try {
//		Student s = (Student)obj;
//		if(name.contentEquals(s.name)&& rollNo == s.rollNo)
//		{
//		return true;	
//		}
//		else
//		{
//			return false;
//		}
//		}
//		catch(ClassCastException e)
//		{
//			return false;
//		}
//		catch(NullPointerException e)
//		{
//			return false;
//		}
//	}
	
	//Method 3 Simplified version
	
//	public boolean equals(Object obj) 
//	{
//		if ( obj instanceof Student)
//		{
//			Student s  = (Student)obj;		
//			if(name.equals(s.name) && rollNo== s.rollNo)
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		return false;
//	}
	
	//to make this method more effiecient we will add obj==this return true in the beginning
	public boolean equals(Object obj) 
	{
		if(obj == this)
		{
			return true;
		}
		
		if ( obj instanceof Student)
		{
			Student s  = (Student)obj;		
			if(name.equals(s.name) && rollNo== s.rollNo)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	
	
	public static void main(String...strings)
	{
		Student s1 = new Student("nitin", 101);
		Student s2 = new Student("karan", 102);
		Student s3 = new Student("nitin", 101);
		Student s4 = s1;
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.equals(null));
		
	}
	
	
}