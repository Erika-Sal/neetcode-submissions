class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }

        int[] result = new int[k];
        while (k > 0) {
            int max = 0;
            int number = 0;  
            for (int num : map.keySet()) {
                if (map.get(num) > max) {
                    max = map.get(num);
                    number = num; 
                }
            }
            result[k - 1] = number; 
            map.remove(number);
            k--; 
        } 
        return result; 

    }
}
