package com.lti.codility.Lesson1;

public class BinaryGap {
	
	public static int Solution(int N) {
		if(N==0)
	        return 0;
	        while(N%2==0)
	        N/=2;
	        int binarygap=0;
	        for(int i=0;N>0;N/=2){
	            if(N%2==0)
	            i++;
	            else{
	                if(i>binarygap)
	                binarygap=i;
	                i=0;
	            }
	        }
	        return binarygap;
	    }
	
		
	
public static void main(String arg[]) {

	System.out.println(Solution(9));
	System.out.println(Solution(5));
	System.out.println(Solution(20));
	System.out.println(Solution(15));
	System.out.println(Solution(1041));


}
}
