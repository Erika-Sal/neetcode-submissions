class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int max = 0; 
        for (int n : set) {
            if (!set.contains(n + 1)) {
                int val = n; 
                int cnt = 1; 
                while (set.contains(val - 1)) {
                    cnt++; 
                    val -= 1; 
                }
                max = Math.max(cnt, max);
            }
            
        }
        return max; 
    }
}
