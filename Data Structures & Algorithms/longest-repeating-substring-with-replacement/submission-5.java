class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];

        int left = 0; 
        int maxFreq = 0; 
        int res = 0; 

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            freq[index]++; 
            if (freq[index] > maxFreq) {
                maxFreq = freq[index];
            }

            while (right - left + 1 - maxFreq > k) {
                freq[s.charAt(left) - 'A']--; 
                left++; 
            }

            res = Math.max(res, right - left + 1);
        }
        return res; 
    }
}
