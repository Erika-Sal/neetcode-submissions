class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0; 
        int max = 0;  
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while (chars.contains(s.charAt(i))) {
                chars.remove(s.charAt(left)); 
                left++; 
            }
            chars.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }
        return max; 
    }
}
