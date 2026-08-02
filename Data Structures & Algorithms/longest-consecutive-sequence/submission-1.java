class Solution {
    public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0; 
    Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 1; 
        for (int num : nums) {
            if (!set.contains(num - 1) && set.contains(num + 1)) {
                 int count = 2; 
                 while (set.contains(num + count)) {
                    count++; 
                 }
                
                if (count > max) {
                    max = count; 
                }
            }
        }
        return max; 
    }
}
