package leetcode;

import java.util.*;

public class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] target = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ++target[s1.charAt(i) - 'a'];
        }
        int[] here = new int[26];
        int k = 0;
        for (int i = 0; i < s2.length(); i++) {
            ++here[s2.charAt(i) - 'a'];
            if (i >= (s1.length()-1)) {
                if (Arrays.equals(target, here)) {
                    return true;
                }
                --here[s2.charAt(k) - 'a'];
                ++k;
            }
        }
        return false;
    }
}
