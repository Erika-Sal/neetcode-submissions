class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Hashset that contains chars of current substring
        //int left = 0
        //loop through chars of string
            //if curr char is in set
                //remove char at left from set until curr char is gone
                //left++;
            //add curr char to list
            //change max to current length of substring if larger (r - l + 1)

        Set<Character> set = new HashSet<>();
        int l = 0; 
        int max = 0; 
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++; 
            }
            max = Math.max(max, r - l + 1);
            set.add(s.charAt(r));
        }
        return max; 

    }
}
