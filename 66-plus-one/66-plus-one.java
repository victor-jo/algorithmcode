class Solution {
    public int[] plusOne(int[] digits) {
        boolean increment = true;
        for (int i=digits.length-1; i>=0; --i) {
            int value = increment ? digits[i] + 1 : digits[i];
            if (value >= 10) {
                digits[i] = 0;
            }
            else if (increment) {
                digits[i] = value;
                increment = false;
            }
            else {
                digits[i] = value;
            }   
        }
        if (increment) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i=1; i<result.length; ++i) {
                result[i] = 0;
            }
            return result;
        }
        return digits;
    }
}