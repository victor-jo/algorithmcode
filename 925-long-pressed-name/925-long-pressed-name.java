class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        
        while (i < name.length() && j < typed.length()) {
            int counti = 1;
            int countj = 1;
            
            while (i < name.length()-1 && name.charAt(i) == name.charAt(i+1)) {
                ++i;
                ++counti;
            }
            
            while (j < typed.length()-1 && typed.charAt(j) == typed.charAt(j+1)) {
                ++j;
                ++countj;
            }
            
            if (name.charAt(i) != typed.charAt(j)) {
                return false;
            }
            
            if (counti > countj) {
                return false;
            }
                        
            while (j < typed.length() && name.charAt(i) == typed.charAt(j)) {
                ++j;
            }
            ++i;
        }
        
        return i == name.length() && j == typed.length();
    }
}