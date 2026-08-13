class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hashmap: key = int in nums && value = index of val in nums
        //as we loop through nums, determine compliment (target - nums[i])
        // see if it's in the map of vals -> return int[i, j]
        //otherwise add nums[i], i to map

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
