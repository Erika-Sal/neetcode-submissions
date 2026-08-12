class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currSet = new ArrayList<>();
        helper(0, 0, nums, target, currSet, res);
        return res; 
    }

    public void helper(int i,  int sum, int[] nums, int target, List<Integer> currSet, List<List<Integer>> res) {
        if (sum == target) {
            res.add(new ArrayList<>(currSet));
            return; 
        } 

        if (sum > target) {
            return; 
        }

        for (int j = i; j < nums.length; j++) {
            sum+=nums[j];
            currSet.add(nums[j]);
            helper(j, sum, nums, target, currSet, res);
            sum-=nums[j];
            currSet.remove(currSet.size() - 1);
        }
    }
}
