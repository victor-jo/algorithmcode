package leetcode;

public class ReverseWordString {
    public String reverseWords(String s) {
        char[] words = s.toCharArray();
        int k = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == ' ') {
                reverse(words, k, i-1);
                k = i+1;
            }
        }

        reverse(words, k, s.length()-1);

        return new String(words);
    }

    private void reverse(char[] word, int left, int right) {
        while (left < right) {
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            ++left;
            --right;
        }
    }
}
