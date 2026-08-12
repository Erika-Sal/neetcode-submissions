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
        helper(0, digits, new StringBuilder(), res, map);
        return res; 
    }

    public void helper(int i, String digits, StringBuilder letters, List<String> res, Map<Character, String> map) {
        if (i >= digits.length()) {
            if (letters.length() > 0) {
                res.add(letters.toString());
            } 
            return; 
        }

        String vals = map.get(digits.charAt(i));
        for (int j = 0; j < vals.length(); j++) {
            letters.append(vals.charAt(j));
            helper(i + 1, digits, letters, res, map);
            letters.deleteCharAt(letters.length() - 1);
        }
    }
}
