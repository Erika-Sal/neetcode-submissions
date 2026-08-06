class Solution {
    public int maxProfit(int[] prices) {
        int max = 0; 
        int left = 0; 
        int right = 1;
        while (right < prices.length) {
            if (prices[right] < prices[left]) {
                left = right; 
            } else {
                int price = prices[right] - prices[left];
                max = Math.max(price, max);
            }
            right++; 
        }

        return max; 
    }
}
