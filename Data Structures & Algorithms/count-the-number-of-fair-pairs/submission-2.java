class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countAtMost(nums, upper) - countAtMost(nums, lower - 1);
    }

    // number of pairs i < j with nums[i] + nums[j] <= x
    private long countAtMost(int[] nums, int x) {
        long cnt = 0;
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if ((long) nums[l] + nums[r] <= x) {
                cnt += r - l;  // nums[l] pairs with every index in (l, r]
                l++;
            } else {
                r--;
            }
        }
        return cnt;
    }
}