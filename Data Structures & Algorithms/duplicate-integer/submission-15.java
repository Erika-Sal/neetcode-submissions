class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Set contains all ints in list so far
        //check if curr int is in list
        //if it is, return true
        //if we get to end of nums, return false

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true; 
            }
            set.add(n);
        }

        return false; 
    }
}