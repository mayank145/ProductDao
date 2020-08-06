
public class Prefixsum {
	
	public static int[] prefixsum(int[] A) {
		int n=A.length;
		int p[]=new int[n+1];
		for(int k=1;k<=n;k++) {
			p[k]=p[k-1]+A[k-1];
		
		}
	return p;
	
	}
	
	public static int count_total(int[] p,int x,int y) {
		return p[y+1];
	}

	public static void main(String[] args) {
		
		int A[]= {2,8,2,4,3,3,5};
		int p[]=prefixsum(A);
	}

}
