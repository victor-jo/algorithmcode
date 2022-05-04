package programmers.impl;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class 영어끝말잇기 {
//public class Solution {

    private static Set<Word> wordSet = new HashSet<>();

    static class Word {
        private final String word;

        public Word(String word) {
            this.word = word;
        }

        public char getLast() {
            return word.charAt(word.length() - 1);
        }

        public char getFirst() {
            return word.charAt(0);
        }

        public boolean isNotWord() {
            return word.length() == 1 || wordSet.contains(this);
        }

        public void seen() {
            wordSet.add(this);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(this.word);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Word target)) {
                return false;
            }
            return Objects.equals(target.word, this.word);
        }
    }

    public int[] solution(int n, String[] words) {
        Word prev = new Word(words[0]);
        if (prev.isNotWord()) {
            return new int[] {1, 1};
        }
        for (int i = 1; i < words.length; i++) {
            prev.seen();
            Word curr = new Word(words[i]);
            if (curr.isNotWord() ||
                prev.getLast() != curr.getFirst()) {
                return new int[] {(i%n)+1, (i/n)+1};
            }
            prev = curr;
        }
        return new int[] {0, 0};
    }
}
