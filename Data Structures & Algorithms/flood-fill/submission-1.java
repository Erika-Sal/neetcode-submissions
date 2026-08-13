class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length; 
        if (image[sr][sc] == color) {
            return image; 
        }
        helper(image, sr, sc, color, image[sr][sc], n, m);
        return image; 
    }

    public void helper(int[][] image, int r, int c, int color, int starting, int n, int m) {

        if (r < 0 || c < 0 || r >= n || c >= m || image[r][c] != starting) {
            return; 
        }

        image[r][c] = color; 
        helper(image, r+1, c, color, starting, n, m);
        helper(image, r-1, c, color, starting, n, m);
        helper(image, r, c+1, color, starting, n, m);
        helper(image, r, c-1, color, starting, n, m);


    }
}