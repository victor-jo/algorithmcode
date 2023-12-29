struct SmallestInfiniteSet {
    visit: Vec<bool>,
    mem_index: usize,
}


/** 
 * `&self` means the method takes an immutable reference.
 * If you need a mutable reference, change it to `&mut self` instead.
 */
impl SmallestInfiniteSet {

    fn new() -> Self {
        Self {
            visit: vec![false; 1001],
            mem_index: 1,
        }
    }

    fn pop_smallest(&mut self) -> i32 {
        for i in self.mem_index..self.visit.len() {
            if !self.visit[i] {
                self.visit[i] = true;
                self.mem_index = i + 1;
                return i as i32;
            }
        }
        0
    }

    fn add_back(&mut self, num: i32) {
        if self.mem_index > num as usize {
            self.mem_index = num as usize;
        }
        self.visit[num as usize] = false;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * let obj = SmallestInfiniteSet::new();
 * let ret_1: i32 = obj.pop_smallest();
 * obj.add_back(num);
 */