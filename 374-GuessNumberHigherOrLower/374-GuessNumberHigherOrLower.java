// Last updated: 2026. 7. 16. 오전 11:26:57
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int begin = 0;
        int end = n;
        
        while (begin < end) {
            int mid = ((begin >> 1) + (end >> 1));
            int is = guess(mid);
            if (is == 0) {
                return mid;
            }
            else if (is > 0) {
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return begin;
    }
}