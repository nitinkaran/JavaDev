
public class StringDuplicateChar {
	public static void Duplicate(String s) {
		
		String str = s;
		char[] c = str.toCharArray();
		for(int i=0 ; i<= c.length-2;i++)
		{
			char temp = c[i];
			int count=0;
			if(temp== c[i+1])
			{
				
				count++;
				System.out.print(temp);
			}
			
		}
		
	}
	
	public static void main(String...strings)
	{
		Duplicate("nitinkaran");
	}
	
}
