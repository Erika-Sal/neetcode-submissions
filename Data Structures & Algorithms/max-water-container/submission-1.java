class Solution {
    public int maxArea(int[] heights) {
        int left = 0; 
        int right = heights.length - 1; 
        int max = Integer.MIN_VALUE;
        while (left < right) {
            int vol = Math.min(heights[left], heights[right]) * (right - left);
            max = Math.max(max, vol);
            if (heights[left] < heights[right]) {
                left++; 
            } else {
                right--;
            }
        }
        return max; 
    }
}
