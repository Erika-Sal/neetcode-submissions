class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int streak = 0; 
        int longest = 0; 
        for (int n : nums) {
            int curr = n; 
            if (!set.contains(n - 1)) {
                streak = 1; 
                while (set.contains(n + streak)) {
                    streak++; 
                }
                longest = Math.max(longest, streak);
            }
        }

        return longest; 
    }
}
