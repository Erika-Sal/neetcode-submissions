class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLessOrEqual(nums, upper) - countLessOrEqual(nums, lower - 1);
    }

    private long countLessOrEqual(int[] nums, int target) {
        long cnt = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if ((long) nums[left] + nums[right] <= target) {
                cnt += right - left;
                left++;
            } else {
                right--;
            }
        }
        return cnt;
    }
}
