class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> uniqueMorseCode = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<word.length(); ++i) {
                sb.append(morseCode[word.charAt(i) - 'a']);
            }
            uniqueMorseCode.add(sb.toString());
        }
        return uniqueMorseCode.size();
    }
}