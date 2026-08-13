class Solution {
    public boolean exist(char[][] board, String word) {
        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (helper(row, col, board, word, 0)) {
                    return true; 
                }
            }
        }
        return false; 
    }

    public boolean helper(int r, int c, char[][] board, String word, int i) {
        if (i == word.length()) {
            return true; 
        }

        if (r < 0 || c < 0 || r >= board.length || c >= board[r].length || board[r][c] != word.charAt(i) || board[r][c] == '#') {
            return false; 
        }

        board[r][c] = '#';
        boolean res = helper(r + 1, c, board, word, i+1) || helper(r - 1, c, board, word, i+1) || helper(r, c+1, board, word, i+1) || helper(r, c-1, board, word, i+1);
        board[r][c] = word.charAt(i);
        return res; 
    }
}
