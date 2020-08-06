import java.util.ArrayList;
import java.util.*;
public class Stonewall_Problem {
	
	public int solution(int[] H)
    {
		int numberOfBlocks = 0;
        int totalHeight = 0;
        
        final ArrayList<Integer> activeBlocks = new ArrayList<Integer>(); // depending on this being insertion-order.
        
        for (int i = 0; i < H.length; i++)
        {
            int height = H[i];
            
            if (totalHeight > height)
            {	
            	for (int j = activeBlocks.size() - 1; j >= 0; j--) // first trouble - how do we scan and remove lesser blocks in O(N) time... is it still O(N)?
                {
                    int latestBlock = activeBlocks.get(j);
                    activeBlocks.remove(j);
                    totalHeight -= latestBlock;

                    if ((totalHeight) <= height) // removed the latest block and now we're not too high.
                    {
                        // we're done.
                        break;
                    }
                }
            	 if (totalHeight < height)
                 {
                     int newBlock = height - totalHeight;
                     totalHeight += newBlock;
                     activeBlocks.add(newBlock);
                     numberOfBlocks++;
                 }
                 
             }
             else if (totalHeight == height)
             {
                 continue;
             }
             else
             {
                 int newBlock = height - totalHeight;
                 activeBlocks.add(newBlock);
                 totalHeight += newBlock;
                 
                 numberOfBlocks++;
            }
        }
        return numberOfBlocks;
    }
	
	public static void main(String[] args) {
		System.out.println(new Stonewall_Problem().solution(new int[] {8, 8, 5, 7, 9, 8, 7, 4, 8}));
	}
}
		
 


