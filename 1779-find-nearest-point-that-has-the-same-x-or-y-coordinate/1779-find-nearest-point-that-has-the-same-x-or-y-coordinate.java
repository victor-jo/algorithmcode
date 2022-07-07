class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int md = Integer.MAX_VALUE;
        int r = -1;
        for (int i=0; i<points.length; ++i) {            
            if (x == points[i][0] || y == points[i][1]) {
                int d = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (md > d) {
                    md = d;
                    r = i;
                }
            }
        }
        return r;
    }
}