class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> uniqueChars = new HashSet<>();
        int max = 0; 
        for (char c : s.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }

        for (char c : uniqueChars) {
            int cnt = 0; 
            int left = 0; 
            for (int r = 0; r < s.length(); r++) {
               if(s.charAt(r) == c) {
                    cnt++; 
               } 
            while ((r - left + 1) - cnt > k) {
                if (s.charAt(left) == c) {
                    cnt--; 
                }
                left++; 
            }
            
            max = Math.max(max, r - left + 1); 
            }
        }
        return max; 
    }
}
