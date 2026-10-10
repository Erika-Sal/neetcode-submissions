class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int max = 0; 
        for (int n : set) {
            int val = n; 
            int streak = 1; 
            if (!set.contains(val + 1)) {
                while (set.contains(val - 1)) {
                    streak++; 
                    val--; 
                }
            }
            max = Math.max(max, streak);
        }
        return max; 
    }
}
