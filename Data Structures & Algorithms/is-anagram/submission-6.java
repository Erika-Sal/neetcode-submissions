class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }

        Map<Character, Integer> stringS = new HashMap<>();
        Map<Character, Integer> stringT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (stringS.get(s.charAt(i)) == null) {
                stringS.put(s.charAt(i), 0);
            }
            stringS.put(s.charAt(i), stringS.get(s.charAt(i)) + 1);

            if (stringT.get(t.charAt(i)) == null) {
                stringT.put(t.charAt(i), 0);
            }

            stringT.put(t.charAt(i), stringT.get(t.charAt(i)) + 1);

        }

        return stringS.equals(stringT);
        
    }
}
