class Solution {
    public int romanToInt(String s) {
        int[][] score = new int[26][26];
        score['I' - 'A'][0] = 1;
        score['V' - 'A'][0] = 5;
        score['X' - 'A'][0] = 10;
        score['L' - 'A'][0] = 50;
        score['C' - 'A'][0] = 100;
        score['D' - 'A'][0] = 500;
        score['M' - 'A'][0] = 1000;
        score['I' - 'A']['V' - 'A'] = 4;
        score['I' - 'A']['X' - 'A'] = 9;
        score['X' - 'A']['L' - 'A'] = 40;
        score['X' - 'A']['C' - 'A'] = 90;
        score['C' - 'A']['D' - 'A'] = 400;
        score['C' - 'A']['M' - 'A'] = 900;
        
        int sum = 0;
        char[] chs = s.toCharArray();
        for (int i=0; i<chs.length; ++i) {
            char c1 = chs[i];
            char c2 = chs.length-1 == i ? c1 : chs[i+1];
            int one = score[c1 - 'A'][0];
            int two = score[c1 - 'A'][c2 - 'A'];
            
            if (one < two) {
                sum += two;
                ++i;
            }
            else {
                sum += one;
            }
        }
        
        return sum;
    }
}