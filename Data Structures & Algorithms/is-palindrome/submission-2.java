class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        String alphaNum = "abcdefghijklmnopqrstuvwxyz0123456789";
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            while ( i < j && alphaNum.indexOf(s.charAt(i)) == -1) {
                i++; 
            }

            while (j > i && alphaNum.indexOf(s.charAt(j)) == -1) {
                j--; 
            }

            if (s.charAt(i) != s.charAt(j)) {
                return false; 
            }
        }
        return true; 
    }
}
