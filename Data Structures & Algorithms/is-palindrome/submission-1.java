class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        String alphaNum = "abcdefghijklmnopqrstuvwxyz0123456789";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (alphaNum.indexOf(s.charAt(i)) != -1) {
                str.append(s.charAt(i));
            }
        }

        String done = str.toString();
        for (int i = 0; i < done.length() / 2; i++){
            if (done.charAt(i) != done.charAt(done.length() - 1 - i)) {
                return false; 
            }
        }
        return true; 
    }
}
