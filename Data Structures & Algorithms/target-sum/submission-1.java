class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        int cnt = 0; 
        cnt += helper(nums, target, nums[0], 1, memo);
        cnt += helper(nums, target, nums[0] * -1, 1, memo);
        return cnt; 
    }

    private int helper(int[] nums, int target, int sum, int index, Map<String, Integer> memo) {
        if (index == nums.length && sum == target) {
            return 1; 
        } else if (index == nums.length) {
            return 0; 
        }
        String key = index + "," + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int cnt = 0; 
        cnt += helper(nums, target, sum + nums[index], index + 1, memo);
        cnt += helper(nums, target, sum - nums[index], index + 1, memo);
        memo.put(key, cnt);
        return cnt; 
    }
}
