impl Solution {
    pub fn rearrange_characters(s: String, target: String) -> i32 {
        let mut alpha: [usize; 26] = [0; 26];
        for c in s.chars() {
            alpha[c as usize - 'a' as usize] += 1;
        }

        let mut count = -1;
        let mut flag = true;

        while flag {
            count += 1;
            for c in target.chars() {
                if alpha[c as usize - 'a' as usize] > 0 {
                    alpha[c as usize - 'a' as usize] -= 1;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        count
    }
}