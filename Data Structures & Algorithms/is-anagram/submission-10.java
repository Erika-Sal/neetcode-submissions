class Solution {
    public boolean isAnagram(String s, String t) {
        //string.toCharArray() for both strings
        //sort arrays
        //if sorted arrays == then anagram otherwise false

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if (Arrays.equals(sArray, tArray)) {
            return true; 
        }

        return false; 
    }
}
