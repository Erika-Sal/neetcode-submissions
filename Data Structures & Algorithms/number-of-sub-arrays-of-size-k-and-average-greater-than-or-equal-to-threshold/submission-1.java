class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0; 
        int currSum = 0; 
        int sumOfVals = threshold * k; 
        int cnt = 0; 
        for (int right = 0; right < arr.length; right++) {
            if (right - left  + 1> k) {
                currSum-=arr[left];
                left++;  
            }
            currSum+=arr[right];
            if (right - left + 1 == k) {
                if(currSum / k >= threshold ) {
                    cnt++; 
                }
            } 
        }

        return cnt; 
    }
}