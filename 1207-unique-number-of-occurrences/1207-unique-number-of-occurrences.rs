impl Solution {
    pub fn unique_occurrences(arr: Vec<i32>) -> bool {
    
    use std::collections::HashMap;

    let mut map = HashMap::new();
    for i in arr {
        let count = map.entry(i).or_insert(0);
        *count += 1;
    }

    use std::collections::HashSet;

    let mut set = HashSet::new();
    for (_, v) in map {
        if !set.insert(v) {
            return false;
        }
    }

    return true;
    }
}