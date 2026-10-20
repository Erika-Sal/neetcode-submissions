class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);

        for (int num : nums) {
            HashMap<Integer, Integer> nextDp = new HashMap<>();
            for (int val : dp.keySet()) {
                nextDp.put(val + num, nextDp.getOrDefault(val + num, 0) + dp.get(val));
                nextDp.put(val - num, nextDp.getOrDefault(val - num, 0) + dp.get(val));
            }

            dp = nextDp; 
        }

        if (dp.containsKey(target)) {
        return dp.get(target);
    }
    return 0; 

    }
    
}   

