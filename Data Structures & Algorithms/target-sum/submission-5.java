class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);
        
        for (int num : nums) {
            HashMap<Integer, Integer> nextDp = new HashMap<>();
            for (int val : dp.keySet()) {
                int count = dp.get(val);
                if (!nextDp.containsKey(val + num)) {
                    nextDp.put(val + num, count);
                } else {
                    nextDp.put(val + num, nextDp.get(val + num) + count);
                }

                if (!nextDp.containsKey(val - num)) {
                    nextDp.put(val - num, count);
                } else {
                    nextDp.put(val - num, nextDp.get(val - num) + count);
                }
            }
            dp = nextDp;
        }
        if(dp.containsKey(target)) {
            return dp.get(target);
        }
        return 0; 
    }
}

