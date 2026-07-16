// Last updated: 2026. 7. 16. 오전 11:27:37
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            char next = (char)(((columnNumber-1)%26) + 'A');
            columnNumber = (columnNumber - 1) / 26;
            sb.append(next);
        }
        return sb.reverse().toString();
    }
}