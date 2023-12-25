impl Solution {
    pub fn has_all_codes(s: String, k: i32) -> bool {
        let limit = 1 << k;
        let mask = (1 << k) - 1;

        let mut seen = vec![false; limit];
        let mut hash = 0;

        let mut count = 0;

        for (i, c) in s.chars().enumerate() {
            hash = ((hash << 1) & mask) | (c as u32 - '0' as u32);
            if i >= (k - 1_i32) as usize && !seen[hash as usize] {
                seen[hash as usize] = true;
                count += 1;
                if count == limit {
                    return true;
                }
            }
        }

        false
    }
}