class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.get(n) == null) {
                map.put(n, 0);
            }
            map.put(n, map.get(n) + 1);
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            int val = 0; 
            for (int n : map.keySet()) {
                if (map.get(n) > max) {
                    max = map.get(n);
                    val = n; 
                }
            }
            res[i] = val; 
            map.remove(val);
        }

        return res; 
    }
}
