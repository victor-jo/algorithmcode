class Solution {
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int len = chars.length;
        int sum = chars[chars.length-1] - 'A' + 1;
        for (int i=0; i<chars.length-1; ++i) {
            int offset = len - i - 1;
            int value = 1;
            for (int j=0; j<offset; ++j) {
                value *= 26;
            }
            sum += (value * (chars[i] - 'A' + 1));
            System.out.println(sum);
        }
        return sum;
    }
}