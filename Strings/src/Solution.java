import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	Scanner in = new Scanner(System.in);

	String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
   
    
    public void sub()
    {
    	
    String s = S;
    int	x = start;
    int	y = end;
    	String str = s.substring(x, y);
    	System.out.println(str);
    }

    public static void main(String[] args) {
        
        Solution so = new Solution();
        so.sub();
        

    }
}
