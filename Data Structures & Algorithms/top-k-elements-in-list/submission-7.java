
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();

        for(int n: nums) {
            if (!counts.containsKey(n)) {
                counts.put(n, 0);
            }
            counts.put(n, counts.get(n) + 1);
        }

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            int max = 0; 
            int val = 0; 
            for (int n : counts.keySet()) {
                if (counts.get(n) > max) {
                    max = counts.get(n);
                    val = n; 
                }
            }
            arr[i] = val; 
            counts.remove(val);
        }
        return arr; 
    }
}
