class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int res = 0; 
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int streak = 1; 
                while (set.contains(n + streak)){
                    streak++;
                }
                if (res < streak) {
                    res = streak;
                }
            }  
        }
        return res; 
    }
}
