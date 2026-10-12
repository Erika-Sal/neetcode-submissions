class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create hashmap <number in array, cnt>
        //loop through that map k times and pull the value with the greatest count
        //remove that value from the hashmap

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            if (!freqMap.containsKey(n)) {
                freqMap.put(n, 0);
            }
            freqMap.put(n, freqMap.get(n) + 1);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int max = 0; 
            int val = 0; 
            for (int n : freqMap.keySet()){
                if (freqMap.get(n) > max) {
                    max = freqMap.get(n);
                    val = n; 
                }
            }
            res[i] = val; 
            freqMap.remove(val);
        }
        return res; 
     }
}
