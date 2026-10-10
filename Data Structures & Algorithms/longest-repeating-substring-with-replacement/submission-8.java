class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0; 
        int right = 0; 

        int[] freq = new int[26];
        int maxFreq = 0; 
        int max = 0; 
        while (right < s.length()) {
            int index = s.charAt(right) - 'A';
            freq[index]++;
            maxFreq = Math.max(freq[index], maxFreq);
            while (right - left + 1 - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++; 
            }

            max = Math.max(max, right - left + 1);
            right++; 
        }
        return max; 
    }
}
