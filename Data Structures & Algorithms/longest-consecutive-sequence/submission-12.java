class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int max = 0; 
        for (int n : set) {
            int val = n; 
            int cnt = 1; 
            if (!set.contains(val + 1)) {
                while (set.contains(val - 1)) {
                    cnt++; 
                    val--; 
                }
            }
            max = Math.max(max, cnt);
        }
        return max; 
    }
}
