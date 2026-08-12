class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        helper(0, digits, "", res);
        return res; 
    }

    public void helper(int i, String digits, String letters, List<String> res) {
        if (i >= digits.length()) {
            if (letters.length() > 0) {
                res.add(letters);
            } 
            return; 
        }

        if (digits.charAt(i) == '2') {
            helper(i + 1, digits, letters + "a", res);
            helper(i + 1, digits, letters + "b", res);
            helper(i + 1, digits, letters + "c", res);
        } else if (digits.charAt(i) == '3'){
            helper(i + 1, digits, letters + "d", res);
            helper(i + 1, digits, letters + "e", res);
            helper(i + 1, digits, letters + "f", res);
        } else if (digits.charAt(i) == '4') {
            helper(i + 1, digits, letters + "g", res);
            helper(i + 1, digits, letters + "h", res);
            helper(i + 1, digits, letters + "i", res);
        } else if (digits.charAt(i) == '5') {
            helper(i + 1, digits, letters + "j", res);
            helper(i + 1, digits, letters + "k", res);
            helper(i + 1, digits, letters + "l", res);
        } else if (digits.charAt(i) == '6') {
            helper(i + 1, digits, letters + "m", res);
            helper(i + 1, digits, letters + "n", res);
            helper(i + 1, digits, letters + "o", res);
        } else if (digits.charAt(i) == '7') {
            helper(i + 1, digits, letters + "p", res);
            helper(i + 1, digits, letters + "q", res);
            helper(i + 1, digits, letters + "r", res);
            helper(i + 1, digits, letters + "s", res);
        } else if (digits.charAt(i) == '8') {
            helper(i + 1, digits, letters + "t", res);
            helper(i + 1, digits, letters + "u", res);
            helper(i + 1, digits, letters + "v", res);
        } else if (digits.charAt(i) == '9') {
            helper(i + 1, digits, letters + "w", res);
            helper(i + 1, digits, letters + "x", res);
            helper(i + 1, digits, letters + "y", res);
            helper(i + 1, digits, letters + "z", res);
        }
    }
}
