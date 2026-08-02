class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Arrays.sort(nums);
      int currCount = 0; 
      int[] res = new int[k];
      int[] freq = new int[k];
      int curr = nums[0];

      for (int i = 0; i < nums.length; i++) {
        if (nums[i] != curr) {
            int minIndex = 0;
            for (int j = 1; j < freq.length; j++) {
                if (freq[j] < freq[minIndex]) {
                    minIndex = j;
                }
            }

            if (currCount > freq[minIndex]) {
                freq[minIndex] = currCount;
                res[minIndex] = curr;
            }
            curr = nums[i];
            currCount = 0; 
        }
        currCount++; 
      }

    for (int j = 0; j < freq.length; j++) {
        if (currCount > freq[j]) {
            freq[j] = currCount; 
            res[j] = curr; 
            break;
        }
    }
      
    return res; 
    }
}
