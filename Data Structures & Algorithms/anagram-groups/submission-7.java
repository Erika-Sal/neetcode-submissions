class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] chars = new int[26];
            for (int i = 0; i < s.length(); i++) {
                chars[s.charAt(i) - 'a']++;
            }
            String temp = Arrays.toString(chars);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
