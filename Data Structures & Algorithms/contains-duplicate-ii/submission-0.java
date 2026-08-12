class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<Integer> set = new ArrayList<>();

        int left = 0; 
        for (int right = 0; right < nums.length; right++) {
            if (right - left > k) {
                set.remove(0);  
                left+=1; 
            }

            if (set.contains(nums[right])) {
                return true; 
            }

            set.add(nums[right]);
        }

        return false; 
    }
}