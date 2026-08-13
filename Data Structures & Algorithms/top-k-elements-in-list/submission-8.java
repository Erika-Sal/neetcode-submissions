class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if(!map.containsKey(n)) {
                map.put(n, 0);
            }
            map.put(n, map.get(n)+1);
        }

        int max = 0; 
        int val = 0; 
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            for (int n: map.keySet()) {
                if (map.get(n) > max) {
                    max = map.get(n);
                    val = n;
                }
            }
            res[i] = val; 
            map.remove(val);
            max = 0; 
        }
        return res; 
    }

}
