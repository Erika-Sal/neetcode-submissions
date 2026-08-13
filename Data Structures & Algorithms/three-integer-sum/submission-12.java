class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Sort Array nums
        //loop until nums[i] > 0
        //int left = i + 1 
        //int right = nums.length - 1; 
        //nums[left] + nums[right] + nums[i] = sum
        //while (left < right) 
        //if (sum == 0) -> add new list of vals to list && break
        //if (sum > 0) -> right--; 
        //if (sum < 0) -> left++; 
        //i++
        //return result
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0; 
        while (i < nums.length && nums[i] <= 0) {
            int l = i+1;
            int r = nums.length - 1;
            if (i > 0 && nums[i] == nums[i-1]) {
                i++; 
                continue; 
            }

            while (l < r) {
                if (l == i) {
                    l++;
                }
                if (r == i) {
                    r--; 
                }
                if (l >= r) {
                    break; 
                }
                int sum = nums[i] + nums[r] + nums[l];
                if (sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[r], nums[l])));
                    l++;
                    r--; 
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++; 
                    }
                    while (l < r && nums[r] == nums[r+1]) {
                        r--; 
                    }
                   
                     
                } else if (sum > 0) {
                    r--;
                    
                } else {
                    l++;
                }
            }

            i++;

        }

        return res; 

    }
}
