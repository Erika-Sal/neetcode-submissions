class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0; 
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    max = Math.max(helper(grid, r, c), max);
                }
            }
        }
        return max; 
    }

    private int helper(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 ) {
            return 0; 
        }

        grid[r][c] = 0; 
        int cnt = 1;

        cnt += helper(grid, r+1, c);
        cnt += helper(grid, r-1, c);
        cnt += helper(grid, r, c+1);
        cnt += helper(grid, r, c-1);
        return cnt;
    }
}
