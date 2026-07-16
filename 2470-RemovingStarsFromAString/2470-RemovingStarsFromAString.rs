// Last updated: 2026. 7. 16. 오전 11:25:14
impl Solution {
    pub fn remove_stars(s: String) -> String {
        let mut stack: Vec::<char> = Vec::new();
        for c in s.chars() {
            if c == '*' {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        stack.iter().collect()
    }
}