class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        int max = 0;
        int maxIndex = -1; 
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; 
            if (max < freq[s.charAt(i) - 'a']) {
                max = freq[s.charAt(i) - 'a'];
                maxIndex = s.charAt(i) - 'a'; 
            }
        }

        if (max > (s.length() + 1) / 2) {
            return "";
        }

        int index = 0; 
        char[] res = new char[s.length()];
        while(max > 0) {
            res[index] = (char) (maxIndex + 'a');
            index+=2; 
            max--; 
        }
        freq[maxIndex] = 0; 
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                if (index >= s.length()) {
                    index = 1; 
                }
                res[index] = (char) (i + 'a');
                index+=2; 
                freq[i]--;

            }
        }
        return new String(res);
    }
}