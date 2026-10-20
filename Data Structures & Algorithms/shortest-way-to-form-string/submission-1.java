class Solution {
    public int shortestWay(String source, String target) {
       boolean[] sourceChars = new boolean[26];
       for (char c : source.toCharArray()) {
            sourceChars[c - 'a'] = true; 
       }

        for (char c : target.toCharArray()) {
            if (!sourceChars[c - 'a']) {
                return -1; 
            }
        }

        int m = source.length();
        int sourcePointer = 0; 
        int cnt = 0; 
        for (char c : target.toCharArray()) {
            if (sourcePointer == 0) {
                cnt++; 
            }
            while (source.charAt(sourcePointer) != c) {
                sourcePointer = (sourcePointer + 1) % m; 
                if (sourcePointer == 0) {
                    cnt++; 
                }
            }
        sourcePointer = (sourcePointer + 1) % m; 
        }
            return cnt; 

    }

}
