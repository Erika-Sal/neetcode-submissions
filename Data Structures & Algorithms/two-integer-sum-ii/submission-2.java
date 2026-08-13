class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //left = 0; right = nums.length - 1; 
        //while (left < right) 
        //int sum = num[left] + num[right];
        //if (sum < target) left++;
        //if (sum > target) right--; 
        //if (sum == target) return new int[left + 1, right + 1]

        int left = 0; 
        int right = numbers.length - 1; 

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; 
            } else {
                right--; 
            }
        }

        return new int[2];



    }
}
