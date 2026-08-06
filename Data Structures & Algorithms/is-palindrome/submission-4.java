class Solution {
    public boolean isPalindrome(String s) {
        int front = 0; 
        int back = s.length() - 1; 
        String alphaNum = "abcdefghijklmnopqrstuvwxyz0123456789";
        s = s.toLowerCase();
        while (front < back) {
            while(front < back && alphaNum.indexOf(s.charAt(front)) == -1) {
                front++; 
            }
            while(front < back && alphaNum.indexOf(s.charAt(back)) == -1) {
                back--; 
            }
            if (front < back && s.charAt(front) != s.charAt(back)) {
                return false; 
            }
            front++; 
            back--; 
        }

        return true; 
    }
}
