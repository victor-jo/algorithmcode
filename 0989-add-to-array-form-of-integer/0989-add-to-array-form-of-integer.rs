impl Solution {
    pub fn add_to_array_form(num: Vec<i32>, k: i32) -> Vec<i32> {
        let mut num = num;
        let mut k = k;
        let mut i = num.len() - 1;
        while k > 0 {
            let sum = num[i] + k;
            num[i] = sum % 10;
            k = sum / 10;
            if i == 0 && k > 0 {
                num.insert(0, 0);
                i += 1;
            }
            i -= 1;
        }
        num
    }
}