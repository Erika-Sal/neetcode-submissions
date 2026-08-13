class Solution {
    public boolean hasDuplicate(int[] nums) {
        //HashSet contains integers we've seen
        //as you loop through, check if curr int is in set
        //if it is then, return true
        //otherwise add to set

        HashMap<Integer, Integer> set = new HashMap<>();
        for(int n: nums) {
            if(set.containsKey(n)) {
                return true; 
            }
            set.put(n, n);
        }

        return false; 
    }
}