package com.lti.codility.Lesson1;

public class Array2 {
	
	public int solution(int[] A) {
		for(int i=0;i<A.length;i++) {
			
			if(A[i]==A[A.length]){
				
				System.out.print(A[i]);
				
			}
			
			
			
			
			
		}
		return 0;
		
	}
	public static void main(String[] arg) {
		Array2 A2=new Array2();
		
		System.out.println(A2.solution(new int[]{9,3,9,3,9,7,9,5}));
	}

}
