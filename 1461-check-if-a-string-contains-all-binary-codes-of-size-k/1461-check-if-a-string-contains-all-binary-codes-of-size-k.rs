impl Solution {
    pub fn has_all_codes(s: String, k: i32) -> bool {
        if s.len() < k as usize {
            return false;
        }

        use std::collections::HashSet;

        let mut binary_set = HashSet::new();
        let mut i = 0_usize;
        let mut j = k as usize;
        while j <= s.len() {
            binary_set.insert(&s[i..j]);
            i += 1;
            j += 1;
        }

        binary_set.len() == 2_usize.pow(k as u32)
    }
}