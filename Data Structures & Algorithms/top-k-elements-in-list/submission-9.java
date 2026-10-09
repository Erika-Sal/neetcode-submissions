class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            if (!freq.containsKey(n)) {
                freq.put(n, 0);
            }
            freq.put(n, freq.get(n) + 1);
        }

        int[] res = new int[k];
        int maxFreq = 0;
        int maxNum = 0; 
        for (int i = k - 1; i >= 0; i--) {
            for (int n : freq.keySet()) {
                if (freq.get(n) > maxFreq) {
                    maxFreq = freq.get(n);
                    maxNum = n; 
                }
            }
            res[i] = maxNum; 
            freq.remove(maxNum);
            maxFreq = 0; 
        }
        return res; 
    }
}
