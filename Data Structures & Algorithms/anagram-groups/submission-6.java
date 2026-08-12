class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] curr = new int[26];
            for (char c : s.toCharArray()) {
                 curr[c - 'a']++; 
            }
            String temp = Arrays.toString(curr);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
