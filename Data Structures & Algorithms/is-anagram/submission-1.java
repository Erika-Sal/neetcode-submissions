class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; 
        ArrayList<Character> seen = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (seen.indexOf(s.charAt(i)) == -1) {
                int sCount = 0; 
                int tCount = 0; 
                for (int j = 0; j < t.length(); j++) {
                    if (s.charAt(j) == s.charAt(i)) {
                        sCount++;
                    }

                    if (t.charAt(j) == s.charAt(i)) {
                        tCount++; 
                    }
                }
                if (sCount != tCount) {
                    return false; 
                }
                seen.add(s.charAt(i));
        }

    }
    return true; 
    }
}
