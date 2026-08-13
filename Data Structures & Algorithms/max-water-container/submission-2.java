class Solution {
    public int maxArea(int[] heights) {
        //int max = 0; int left = 0; int right = heights.length - 1
        //while (left < right)
            //int vol = Math.min(heights[left], heights[right]) * (right - left)
            //max = Math.max(max, vol);
            //if (heights[left] < heights[right]) left++;
            //else right--;
        //return max; 

        int max = 0; 
        int l = 0;
        int r = heights.length - 1; 
        while (l < r) {
            int vol = Math.min(heights[l], heights[r]) * (r - l);
            max = Math.max(max, vol);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--; 
            }
        }

        return max; 
    }
}
