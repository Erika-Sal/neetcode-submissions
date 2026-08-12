class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int maxFreq = 0;
        int left = 0; 
        int max = 0; 

        for (int right = 0; right < s.length(); right++) {
            if (count.get(s.charAt(right)) == null) {
                count.put(s.charAt(right), 0);
            }

            count.put(s.charAt(right), count.get(s.charAt(right)) + 1);
            maxFreq = Math.max(maxFreq, count.get(s.charAt(right)));

            while (right - left + 1 - maxFreq > k) {
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++; 
            }

            max = Math.max(max, right - left + 1);
        }
        return max; 
    }
}
