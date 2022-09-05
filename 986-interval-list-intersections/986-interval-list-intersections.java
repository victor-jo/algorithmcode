class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<Integer[]> result = new ArrayList<>();
        for (int i=0; i<firstList.length; ++i) {
            for (int j=0; j<secondList.length; ++j) {
                int x1 = firstList[i][0];
                int x2 = firstList[i][1];
                int y1 = secondList[j][0];
                int y2 = secondList[j][1];
                
                if (isConflict(x1, x2, y1, y2)) {
                    result.add(new Integer[] {
                        Math.max(x1, y1),
                        Math.min(x2, y2)
                    });
                }
            }

        }
        
        int[][] output = new int[result.size()][2];
        for (int i=0; i<result.size(); ++i) {
            output[i][0] = result.get(i)[0];
            output[i][1] = result.get(i)[1];
        }
        
        return output;
    }
    
    
    public boolean isConflict(int x1, int x2, int y1, int y2) {
        return x1 <= y2 && x2 >= y1;
    }
}