class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> set = new ArrayList<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false; 
    }
}