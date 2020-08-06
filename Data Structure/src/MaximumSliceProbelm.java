import java.util.*;
public class MaximumSliceProbelm {
	
	public int golden_max_slice(int A[]) {
		
		int max_ending=0,max_slice=0;
		
		for(int i=0;i<A.length;i++) {
			
			max_ending=Math.max(max_ending + i);
			max_slice=Math.max(max_slice,max_ending);
		}
		
		return max_slice;
		
	}
	
	public static void main(String arg[]) {
		
		int A[]=new int[] {2,-1,-2,4,10};
	
		MaximumSliceProblem M=new MaximumSliceProblem();
		
		System.out.println(M.MaximmummSliceProblem(A[]));
		
		
	}

}
