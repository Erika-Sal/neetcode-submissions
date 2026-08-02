class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false; 
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!sMap.containsKey(c)) {
                sMap.put(c, 0);
            }
            sMap.put(c, sMap.get(c) + 1);

            c = t.charAt(i);
            if(!tMap.containsKey(c)){
                tMap.put(c, 0);
            }
            tMap.put(c, tMap.get(c) + 1);
        }

        return tMap.equals(sMap);

    }
}
