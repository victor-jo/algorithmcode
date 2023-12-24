impl Solution {
    pub fn valid_mountain_array(arr: Vec<i32>) -> bool {
        let mut i = 0;
        let mut j = arr.len() - 1;
        while i < arr.len() - 1 && arr[i] < arr[i + 1] {
            i += 1;
        }
        while j > 0 && arr[j] < arr[j - 1] {
            j -= 1;
        }
        i > 0 && i == j && j < arr.len() - 1
    }
}