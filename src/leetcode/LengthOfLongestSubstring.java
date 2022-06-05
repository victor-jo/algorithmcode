package leetcode;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        StringBuilder substring = new StringBuilder();
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            while (substring.toString().indexOf(arr[i]) != -1) {
                substring = new StringBuilder(substring.substring(1));
            }
            substring.append(arr[i]);
            longest = Math.max(longest, substring.length());
        }
        return longest;
    }
}
