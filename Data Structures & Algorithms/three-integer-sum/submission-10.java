class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int index = 0; 
        while ( index < nums.length && nums[index] <= 0) {

            if (index > 0 && nums[index] == nums[index-1]) {
                index++; 
                continue; 
            }

            int left = index+1; 
            int right = nums.length - 1; 
            while (left < right) {
                if (left == index) {
                    left++; 
                }
                if (right == index) {
                    right--; 
                }
                if (left < right) {
                    int sum = nums[index] + nums[right] + nums[left];
                    if (sum == 0) {
                        res.add(new ArrayList<Integer>(Arrays.asList(nums[index], nums[right], nums[left])));
                        left++; 
                        right--; 
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < 0) {
                        left++; 
                    } else if (sum > 0) {
                        right--; 
                    }
                }
               
            }
            index++; 
        
        }
        return res; 
    }
}
