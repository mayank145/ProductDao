
public class MaxEvenSum {

	 int pos_sum = 0; 
     for (int i = 0; i < n; ++i) 
         if (arr[i] > 0) 
             pos_sum += arr[i]; 

     // If sum is even, it is our 
     // answer 
     if (pos_sum % 2 == 0) 
         return pos_sum; 

     // Traverse the array to find the 
     // maximum sum by adding a  
     // positive odd or subtracting a 
     // negative odd 
     int ans = Integer.MIN_VALUE; 
     for (int i = 0; i < n; ++i) { 
         if (a[i] % 2 != 0) { 
             if (arr[i] > 0) 
                 ans = ans>(pos_sum - arr[i]) ?  
                       ans:(pos_sum - arr[i]); 
             else
                 ans = ans>(pos_sum + arr[i]) ?  
                       ans:(pos_sum + arr[i]); 
         } 
     }    

     return ans;  
 } 

 // driver program    
 public static void main(String s[]) 
 { 
     int a[] = {-2, 2, -3, 1}; 
       
     System.out.println(maxEvenSum(a, a.length));     

 } 
}
