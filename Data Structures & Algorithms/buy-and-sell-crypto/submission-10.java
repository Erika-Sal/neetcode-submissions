class Solution {
    public int maxProfit(int[] prices) {
        int right = 1; 
        int left = 0; 
        int max = 0; 
        while (right < prices.length) {
            if (prices[right] < prices[left]) {
                left = right;
            }
            int profit = prices[right] - prices[left];
            max = Math.max(profit, max);
            right++; 
        }
        return max; 
    }
}
