
public class Student {

	int rollNo ;
	String name;
	String city; 
	
	public Student( int rollNo , String name , String city) {
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		
	}
	
	public String toString()
	{
	return rollNo +" "+name+" "+city;
	}
	
	public static void main(String ...strings)
	{
		Student s1 = new Student( 11 , " nitin" , "Jaipur");
		Student s2 = new Student( 12 , " karan" , "lucknow");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
