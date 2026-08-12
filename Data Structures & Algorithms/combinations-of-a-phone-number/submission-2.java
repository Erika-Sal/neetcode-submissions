class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>(Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        ));
        helper(0, digits, "", res, map);
        return res; 
    }

    public void helper(int i, String digits, String letters, List<String> res, Map<Character, String> map) {
        if (i >= digits.length()) {
            if (letters.length() > 0) {
                res.add(letters);
            } 
            return; 
        }

        String vals = map.get(digits.charAt(i));
        for (int j = 0; j < vals.length(); j++) {
            letters += vals.substring(j, j+1);
            helper(i + 1, digits, letters, res, map);
            letters = letters.substring(0, letters.length() - 1);
        }
    }
}
