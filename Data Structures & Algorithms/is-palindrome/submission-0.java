class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("\\s", "");
        newS = newS.replaceAll("[^a-zA-Z0-9]", "");
        newS = newS.toLowerCase();
        for (int i = 0; i < newS.length() / 2; i++) {
            if (newS.charAt(i) != newS.charAt(newS.length() - i - 1)) {
                return false; 
            }
        }

        return true; 
    }
}
