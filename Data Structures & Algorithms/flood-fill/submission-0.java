class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image; 
        }
        helper(image, sr, sc, color, image[sr][sc]);
        return image; 
    }

    public void helper(int[][] image, int r, int c, int color, int starting) {

        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] != starting) {
            return; 
        }

        image[r][c] = color; 
        helper(image, r+1, c, color, starting);
        helper(image, r-1, c, color, starting);
        helper(image, r, c+1, color, starting);
        helper(image, r, c-1, color, starting);


    }
}