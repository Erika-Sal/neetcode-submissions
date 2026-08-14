class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0; 
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == 1){
                    max = Math.max(helper(r, c, grid), max);
                }
            }
        }
        return max; 
    }

    private int helper(int r, int c, int[][] grid) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0; 
        }
        
        grid[r][c] = 0;
        int cnt = 1;

        cnt += helper(r + 1, c, grid);
        cnt += helper(r - 1, c, grid);
        cnt += helper(r, c + 1, grid);
        cnt += helper(r, c - 1, grid);
        return cnt;
    }
}
