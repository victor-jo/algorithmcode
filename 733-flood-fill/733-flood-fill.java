class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            floodFill(image, sr, sc, color, newColor);
        }
        return image;
    }

    private void floodFill(int[][] image, int sr, int sc, int color, int newColor) {
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor;
            if (sr > 0) floodFill(image, sr-1, sc, color, newColor);
            if (sc > 0) floodFill(image, sr, sc-1, color, newColor);
            if (sr+1 < image.length) floodFill(image, sr+1, sc, color, newColor);
            if (sc+1 < image[0].length) floodFill(image, sr, sc+1, color, newColor);
        }
    }
}