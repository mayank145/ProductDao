
public class Greedy_Algorithm_Money_Changing {

	public static int coinChangeGreedy(int[] coins, int n) {

        int result = 0;

        while (n != 0)
        {

            for (int i=coins.length - 1 ; i>=0 ; i--)
            {
                if (coins[i] <= n)
                {
                    n = n - coins[i];
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] coins = {1,5,10,50};
        int n = 20;
        Greedy_Algorithm_Money_Changing g=new  Greedy_Algorithm_Money_Changing(); 
        System.out.println(g.coinChangeGreedy(coins, n));

}
}
