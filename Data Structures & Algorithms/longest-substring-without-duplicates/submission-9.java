class Solution {
    public int lengthOfLongestSubstring(String s) {
        //hashset contains window of letters in substring
        //left = 0;
        //max = 0
        //loop through string
            //while (set contains new letter)
                //remove start of list
                //left++;
            //max = Math.max(right - left + 1, max)
            //add char to set
        //return max

        Set<Character> set = new HashSet<>();
        int l = 0; 
        int max = 0; 
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++; 
            }
            max = Math.max(r - l + 1, max);
            set.add(s.charAt(r));
        }
        return max; 
    }
}
