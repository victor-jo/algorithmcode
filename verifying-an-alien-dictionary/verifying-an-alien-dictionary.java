class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderPoint = getOrderPoint(order);
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j > words[i+1].length()-1) return false;
                if (words[i].charAt(j) != words[i+1].charAt(j)) {
                    int a = words[i].charAt(j) - 'a';
                    int b = words[i+1].charAt(j) - 'a';

                    if (orderPoint[a] > orderPoint[b]) {
                        return false;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return true;
    }

    private int[] getOrderPoint(String order) {
        int[] result = new int[26];
        for (int i = 0; i < order.length(); i++) {
            result[order.charAt(i) - 'a'] = i;
        }
        return result;
    }
}