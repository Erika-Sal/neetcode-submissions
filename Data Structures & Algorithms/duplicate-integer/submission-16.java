class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> map = new ArrayList<>();

        for (int n : nums) {
            if(map.contains(n)) {
                return true; 
            }
            map.add(n);
        }
        return false; 
    }
}