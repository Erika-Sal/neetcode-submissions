class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        String alphaNum = "abcdefghijklmnopqrstuvwxyz0123456789";
        s = s.toLowerCase();
        int lastPointer = s.length() - 1; 
        for (int i = 0; i <= lastPointer; i++) {
            while (alphaNum.indexOf(s.charAt(i)) == -1 && i < lastPointer ) {
                i++; 
            }
            while (alphaNum.indexOf(s.charAt(lastPointer)) == -1 && lastPointer > i){
                lastPointer--; 
            }

            if (s.charAt(i) != s.charAt(lastPointer)) {
                return false; 
            }

            lastPointer--; 

           
        }   
        return true; 
    }
}
