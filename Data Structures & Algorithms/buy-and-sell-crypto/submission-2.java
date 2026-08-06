class Solution {
    public int maxProfit(int[] prices) {
        int max = 0; 
        int left = 0; 
        int right = left+1; 
        while(right < prices.length) {
            if (prices[right] < prices[left]) {
                left = right;
            } else {
                int price = prices[right] - prices[left];
                max = Math.max(max, price);
            }
            right++;
        }
        return max; 
    }
}
