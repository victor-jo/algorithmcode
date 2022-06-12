class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }

        int i = 0;

        while (i < s.length()) {
            for (int j = 0; j < numRows && i < s.length(); j++) {
                stringBuilders[j].append(s.charAt(i++));
            }
            for (int j = numRows-2; j >= 1 && i < s.length(); j--) {
                stringBuilders[j].append(s.charAt(i++));
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : stringBuilders) {
            result.append(stringBuilder.toString());
        }
        return result.toString();
    }
}