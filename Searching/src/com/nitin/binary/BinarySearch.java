package com.nitin.binary;
public class BinarySearch{
	
	
	
	int mid; int flag =0;
	
	public void search(int beg , int end  , int X , int Arr[])
	
	{
		
		
		        
		        
		            while(beg<=end)
		                 {
		            	//sSystem.out.println("inside while");
			
		                   mid = (beg + end)/2;
		                   
//		                   System.out.println("midvalue: " + mid);
//		                   System.out.println("value " + X);
		                   
		                   if( X == Arr[mid])
		                       {
			                     flag = 1;
			                     //System.out.println("flag is 1");
			
			                     break;
		                       }
		
		                   else if(X < Arr[mid])
		                       {
			                     end = mid -1;
		                        }
		                    else if(X > Arr[mid]) {
			
			                    beg = mid + 1 ;
		                        }
			
		                 }
		            
		            if(flag == 0)
		            System.out.println(" no element found");
		            else
		            	System.out.println("element found at: " + mid);
		            
		
	   }
		
				
	}
	

