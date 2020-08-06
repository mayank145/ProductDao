package com.lti.codility.Lesson1;

public class Array {
	
	public static int[] solution(int[] A, int K) {
		
		int[] newArray = new int[A.length];
	    for(int i = 0 ; i < A.length ; i++) {
	        int newPosition = (i + K)%A.length;
	        newArray[newPosition] = A[i];
	    }
	    return newArray;
		
		
	}
	
	public static void mai(String arg[]) {
		

		System.out.print(solution(new int[]{3,8,9,7,6} ,3));
		
	}
}
