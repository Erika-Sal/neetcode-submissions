class Solution {
    public boolean isPalindrome(String s) {
        //s to lowercase
        //left = 0; right = s.length() - 1;
        //while(left < right)
        //if char at left is not alphanum, keep increasing until alphanum -> repeat process with right except decrease right
        //if char at left != char at right -> return false
        //return true; 

        s = s.toLowerCase();
        int left = 0; 
        int right = s.length() - 1; 
        String alphanum = "abcdefghijklmnopqrstuvwxyz0987654321";

        while(left < right) {
            while(left < right && alphanum.indexOf(s.charAt(left)) == -1){
                left++; 
            }
            while(left < right && alphanum.indexOf(s.charAt(right)) == -1){
                right--; 
            }

            if (left < s.length() && s.charAt(right) != s.charAt(left)) {
                return false; 
            }
            left++; 
            right--; 
        }

        return true; 
    }
}
