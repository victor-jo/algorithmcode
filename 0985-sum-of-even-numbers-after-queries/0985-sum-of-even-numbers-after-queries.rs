impl Solution {
    pub fn sum_even_after_queries(mut nums: Vec<i32>, queries: Vec<Vec<i32>>) -> Vec<i32> {
        let mut result = Vec::new();
        let mut sum = 0;
        for i in 0..nums.len() {
            if nums[i] % 2 == 0 {
                sum += nums[i];
            }
        }
        for i in 0..queries.len() {
            let index = queries[i][1] as usize;
            let val = queries[i][0];
            if nums[index] % 2 == 0 {
                sum -= nums[index];
            }
            nums[index] += val;
            if nums[index] % 2 == 0 {
                sum += nums[index];
            }
            result.push(sum);
        }
        result
    }
}