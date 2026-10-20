class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0; 
        Queue<int[]> q = new ArrayDeque<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == 1) fresh++; 
                if (grid[r][c] == 2) q.add(new int[]{r, c});
            }
        }

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int mins = 0;
        while(!q.isEmpty() && fresh > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] currPair = q.poll();
                int currRow = currPair[0];
                int currCol = currPair[1];
                for (int[] d : dirs){
                    int newRow = currRow + d[0];
                    int newCol = currCol + d[1];
                    if (newRow < 0 || newCol < 0 || newRow >= grid.length || newCol >= grid[newRow].length || grid[newRow][newCol] == 0 || grid[newRow][newCol] == 2) {
                        continue; 
                    }
                    fresh--; 
                    grid[newRow][newCol] = 2; 
                    q.add(new int[]{newRow, newCol});
                }
            }
            mins++; 
        }

        if (fresh != 0) {
            return -1;
        }
        return mins; 
    }
}
