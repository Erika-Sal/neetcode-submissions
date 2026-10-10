class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0; 
        int r = s.length() - 1; 
        String alphaNum = "abcdefghijklmnopqrstuvwxyz0123456789";

        while (l < r) {
            while (l < r && alphaNum.indexOf(s.charAt(l)) == -1) {
                l++; 
            }

            while(l < r && alphaNum.indexOf(s.charAt(r)) == -1 ) {
                r--; 
            }

            if(l < r && s.charAt(l) != s.charAt(r)) {
                return false; 
            }
            l++; 
            r--; 
        }

        return true; 
    }
}
