class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] alphaCount = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                alphaCount[strs[i].charAt(j) - 'a']++;
            }

            String val = Arrays.toString(alphaCount);
            if (map.get(val) == null) {
                map.put(val, new ArrayList<String>());
            }
            map.get(val).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
