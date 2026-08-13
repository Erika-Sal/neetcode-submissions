class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 0; 
        for (int n : nums) {
            int cnt = 1; 
            int val = n;
            if (!set.contains(val + 1) ) {
                while (set.contains(val - 1)) {
                    cnt++; 
                    val--; 
                }
            } 
            
            max = Math.max(max, cnt);
            set.add(n);
        }
        return max; 
    }
}
