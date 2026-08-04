class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0;
        int pointer = 1; 
        while (pointer < nums.length) {
            if (nums[curr] != nums[pointer]) {
                nums[curr+1] = nums[pointer];
                curr++; 
                pointer++;
            } else {
                pointer++; 
            }
        }

        return curr + 1; 
    }
}