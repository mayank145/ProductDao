import java.util.*;
public class Binary_count {
	
	int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; ) {
            if (A[k] == B[i])
                return A[k];
            if (i < m-1  && B[i] < A[k])
                i += 1;
        else
        k+=1;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int[] A = {2,4,6,7};
		int[] B = {2, 1, 1, 8};
		
		Binary_count b=new Binary_count();
		
		System.out.println(b.solution(A,B));
		
		//System.out.println(new Binary_count.solution(A, B));
		
		// No error in this code
	

}
}
