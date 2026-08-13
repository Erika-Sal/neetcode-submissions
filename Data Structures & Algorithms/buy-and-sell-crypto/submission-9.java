class Solution {
    public int maxProfit(int[] prices) {
        int max = 0; 
        int l = 0; 
        for (int r = 0; r < prices.length; r++) {
            if (prices[r] < prices[l]) {
                l = r; 
            }
            int profit = prices[r] - prices[l];
            max = Math.max(profit, max);
        }

        return max; 
            
    }
}
