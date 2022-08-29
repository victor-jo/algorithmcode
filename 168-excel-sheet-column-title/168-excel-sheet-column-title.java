class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        while (columnNumber > 0) {
            char next = (char)(((columnNumber-1)%26) + 'A');
            columnNumber = (columnNumber - 1) / 26;
            result = next + result;
        }
        return result;
    }
}