class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] alpha = new int[26];
            for (int i = 0; i < s.length(); i++) {
                alpha[s.charAt(i) - 'a'] += 1;
            }

            String temp = Arrays.toString(alpha);
            if (map.get(temp) == null) {
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
