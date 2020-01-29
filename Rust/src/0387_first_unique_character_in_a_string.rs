//! Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//!
//! Examples:
//!
//! s = "leetcode"
//! return 0.
//!
//! s = "loveleetcode",
//! return 2.
//!
//! Note: You may assume the string contain only lowercase letters.
use std::collections::HashMap;

struct Solution;

impl Solution {
    pub fn first_uniq_char(s: String) -> i32 {
        let mut map: HashMap<char, i32> = HashMap::new();
        s.chars().into_iter().enumerate().for_each(|(index, c)| {
            if let Some(v) = map.get_mut(&c) {
                if *v != i32::max_value() {
                    // use i32::max_value() to indicate this char has appeared more than once.
                    *v = i32::max_value();
                }
            } else {
                map.insert(c, index as i32);
            }
        });

        let min_index = map.iter().min_by(|(c1, index1), (c2, index2)| {
            index1.cmp(index2)
        });

        match min_index {
            Some((_, index)) => {
                if *index == i32::max_value() {
                    -1
                } else {
                    *index as i32
                }
            }
            None => {
                -1
            }
        }
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::first_uniq_char(String::from("leetcode")), 0);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::first_uniq_char(String::from("loveleetcode")), 2);
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::first_uniq_char(String::from("aadadaad")), -1);
    }
}