class Solution {
    public int[] plusOne(int[] digits) {
        int increment = 1;
        for (int i=digits.length-1; i>=0; --i) {
            digits[i] = digits[i] + increment;
            increment = digits[i] / 10;
            digits[i] = digits[i] % 10;
        }
        if (increment == 1) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}