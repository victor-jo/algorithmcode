class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int distance = Integer.MAX_VALUE;
        int result = -1;
        for (int i=0; i<points.length; ++i) {
            if (x == points[i][0] && distance > Math.abs(y - points[i][1])) {
                distance = Math.abs(y - points[i][1]);
                result = i;
            }
            if (y == points[i][1] && distance > Math.abs(x - points[i][0])) {
                distance = Math.abs(x - points[i][0]);
                result = i;
            }
        }
        return result;
    }
}