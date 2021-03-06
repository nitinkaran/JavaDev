import java.util.*;

public class SmallestAndLargest {
  
	 public static String getSmallestAndLargestList(String s, int k) {
	       // Vector<String> substrings = new Vector<String>();
	        ArrayList<String> substrings = new ArrayList<String>();
	        for (int i = 0; i <= s.length() - k; i++) {
	            // Add a substring of length 'k' to our list
	            substrings.add( s.substring(i, i + k) );	
	        }
	        
	        // Sort list
	        Collections.sort(substrings);
	        
	        // Set first and last elements as smallest and largest
	        String smallest = substrings.get(0);
	        String largest = substrings.get(substrings.size() - 1);
	        
	        return smallest + "\n" + largest;
	    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println( getSmallestAndLargestList(s, k));
    }
}