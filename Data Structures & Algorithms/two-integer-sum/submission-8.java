class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int complement = target - curr; 
            if (map.get(complement) != null) {
                return new int[]{map.get(complement), i};
            }
            map.put(curr, i);
        }
        return new int[]{};
    }
}
