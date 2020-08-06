
public class CodilityExamQue {
	
		public int solution(int N) {
				int sum=0;
			while(N>0) {
				sum =sum +N%10;
				N=N/10;
				
			}
				
			for(int i=1;i>0;i++) {
				int sum1=0;
				 sum1=sum1+i%10;
				i =i/N;
				
				if(sum==sum1) {
					return i;
				}
						
			}
			
			return sum;
			
			
		}
				
	public static void main(String[] args) {
		
		CodilityExamQue c=new CodilityExamQue();
		
		System.out.println(c.solution(10));
		
		
	}

}
