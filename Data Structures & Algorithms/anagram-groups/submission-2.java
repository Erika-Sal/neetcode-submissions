class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] alpha = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                alpha[strs[i].charAt(j) - 'a']++;
            }

            String temp = Arrays.toString(alpha);
            if(!map.containsKey(temp)) {
                map.put(temp, new ArrayList<String>());
            }
            map.get(temp).add(strs[i]);
        }

        List<List<String>> res = new ArrayList<>(map.values());
        return res; 
    }
}