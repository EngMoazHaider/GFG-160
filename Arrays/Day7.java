public class Day7
{
    public int maximumProfit(int prices[]) 
    { 
        int profit =0;
        for(int i =0; i < prices.length-1 ;i++)
        {
            if(prices[i+1] > prices[i])
                profit += prices[i+1] -prices[i];
        } 
        return profit;
    }

    // this another solution with more explain and details
    public int maximumProfit1(int prices[]) 
    {
        // If there's only one price, no profit can be made
        if (prices.length == 1)
            return 0;
        
        int sell = 0;         // Variable to store the buying price
        int profit = 0;       // Total profit accumulator
        boolean selld = false; // Indicates if a stock has been bought

        // Traverse the prices array up to the second-to-last element
        for (int i = 0; i < prices.length - 1; i++) {
            // If current price is less than the next and we haven't bought yet → Buy
            if (prices[i] < prices[i + 1] && !selld) {
                sell = prices[i];   // Buy at current price
                selld = true;       // Mark that we've bought
            }
            // If current price is greater than the next and we have bought → Sell
            else if (prices[i] > prices[i + 1] && selld) {
                profit += prices[i] - sell;  // Sell and add profit
                selld = false;               // Reset buy flag
            }
        }

        // Final check: if price is still rising at the end and we've bought → Sell
        if ((prices[prices.length - 1] > sell) && selld) {
            profit += prices[prices.length - 1] - sell;
        }

        return profit;  // Return the total profit
    }
}