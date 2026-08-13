class Solution {
    public boolean hasDuplicate(int[] nums) {
        //HashSet contains integers we've seen
        //as you loop through, check if curr int is in set
        //if it is then, return true
        //otherwise add to set

        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            if(set.contains(n)) {
                return true; 
            }
            set.add(n);
        }

        return false; 
    }
}