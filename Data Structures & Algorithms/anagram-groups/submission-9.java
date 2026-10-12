class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //get letter count of each string
        //go through each string in strs and get letter count, store in array
        //use that as the key for hashmap where <String, List<String>>
        //return list
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] temp = new int[26];
            for (int i = 0; i < s.length(); i++) {
                temp[s.charAt(i) - 'a']++;
            }
            String count = Arrays.toString(temp);
            if (!map.containsKey(count)) {
                map.put(count, new ArrayList<>());
            }
            map.get(count).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
