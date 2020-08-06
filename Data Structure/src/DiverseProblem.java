import java.util.*;
public class DiverseProblem {
	
	public String Function(String A[],int x,int y,int z) {
		
		for(int i=0;i<A.length;i++) {
			
			if(A[i]!=A[i+1]) {
				System.out.println(A[i]);
			}
		
		
			
		
	}
	
	public static void main (String arg[]) {
		
		DiverseProblem d=new DiverseProblem();
		
		System.out.print(d.Function(new String[]{"a","b","c"} ,1,3,1));
		}
	}

}
