
public class Day8 
{
    public int maximumProfit(int prices[]) 
    {    
        int profit =0;
        int minPrice =prices[0];
        for(int i =0; i < prices.length ; i++)
        {
            if(prices[i] < minPrice)
                minPrice =prices[i];
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }    
}
