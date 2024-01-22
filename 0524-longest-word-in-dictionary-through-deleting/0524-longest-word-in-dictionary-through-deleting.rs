impl Solution {
    pub fn find_longest_word(s: String, dictionary: Vec<String>) -> String {
        let mut longest_word = String::new();
        for word in dictionary {
            if is_subsequence(&word, &s) {
                if word.len() > longest_word.len() {
                    longest_word = word;
                } else if word.len() == longest_word.len() {
                    if word < longest_word {
                        longest_word = word;
                    }
                }

            }
        }
        longest_word
    }
}

fn is_subsequence(p0: &String, p1: &String) -> bool {
    let mut i = 0;
    let mut j = 0;
    let p0 = p0.as_bytes();
    let p1 = p1.as_bytes();

    if p0.len() > p1.len() {
        return false;
    }

    while i < p0.len() && j < p1.len() {
        if p0[i] == p1[j] {
            i += 1;
            j += 1;
        } else {
            j += 1;
        }
    }
    i == p0.len()
}
