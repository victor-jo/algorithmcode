// Last updated: 2026. 7. 16. 오전 11:28:58
#include <iostream>
#include <string>
#include <climits> // INT_MAX, INT_MIN 사용을 위해 필요

using namespace std;

class Solution {
public:
    int myAtoi(string s) {
        int i = 0;
        int n = s.length();
        
        // 1. 공백 처리: 앞부분의 공백을 건너뜁니다.
        while (i < n && s[i] == ' ') {
            i++;
        }
        
        // 2. 부호 처리: '+' 또는 '-'가 있는지 확인합니다.
        int sign = 1;
        if (i < n && (s[i] == '+' || s[i] == '-')) {
            sign = (s[i] == '-') ? -1 : 1;
            i++;
        }
        
        // 3. 숫자 변환 및 오버플로우 체크
        long result = 0; // 계산 중 32비트 범위를 넘을 수 있으므로 long 사용
        while (i < n && isdigit(s[i])) {
            result = result * 10 + (s[i] - '0');
            
            // 4. 범위 제한 (Rounding)
            // 매 단계마다 범위를 체크하여 즉시 반환함으로써 효율성을 높입니다.
            if (sign == 1 && result > INT_MAX) return INT_MAX;
            if (sign == -1 && -result < INT_MIN) return INT_MIN;
            
            i++;
        }
        
        return (int)(result * sign);
    }
};