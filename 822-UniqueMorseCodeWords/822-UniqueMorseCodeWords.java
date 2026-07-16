// Last updated: 2026. 7. 16. 오전 11:26:19
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