// Last updated: 2026. 7. 16. 오전 11:28:53
#include <iostream>
#include <array>
#include <algorithm>

static constexpr std::array<char, 7> keys = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
static constexpr std::array<int, 7> values = {1, 5, 10, 50, 100, 500, 1000};

constexpr int get_max_subtractable_index(int n) {
    auto it = std::upper_bound(values.begin(), values.end(), n);
    if (it == values.begin()) return -1;
    return std::distance(values.begin(), it) - 1;
}

class Solution {
public:
    string convert_to_roman(int num, int i) {
        string r = "";
        for (int n=num-values[i]; n>0; r+=keys[i],n-=values[i]) {
             i = get_max_subtractable_index(n);
             if (i == -1) break;
        }
        return r;
    }

    string intToRoman(int num) {
        string r = "";

        int p = 1;
        for (int t=num; t>=10; t/=10, p*=10);

        for (; p>0; p/=10) {
            int n = (num / p) % 10;
            int m = n * p;
            if (n != 4 && n != 9) {
                // case 1. started from 4 or 9
                int i = get_max_subtractable_index(m);
                if (i != -1) {
                    r += keys[i];
                    r += convert_to_roman(m, i);
                }
            } else {
                // case 2. not started from 4 or 9
                switch (m) {
                    case 4:
                        r += "IV";
                        break;
                    case 9:
                        r += "IX";
                        break;
                    case 40:
                        r += "XL";
                        break;
                    case 90:
                        r += "XC";
                        break;
                    case 400:
                        r += "CD";
                        break;
                    case 900:
                        r += "CM";
                        break;
                    default:
                        break;
                }
            }
        }

        return r;
    }
};