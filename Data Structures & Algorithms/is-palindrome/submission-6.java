class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; 
        int right = s.length() - 1; 
        s = s.toLowerCase();
        String alphaNum = "abcdefghijklmnopqrstuvwxyz0987654321";

        while (left < right) {
            while (left < s.length() && alphaNum.indexOf(s.charAt(left)) == -1) {
                left++;
            }

            while(right > -1 && alphaNum.indexOf(s.charAt(right)) == -1) {
                right--; 
            }

            if (left < s.length() && right > -1 && s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++; 
            right--; 
        }

        return true; 

    }
}
