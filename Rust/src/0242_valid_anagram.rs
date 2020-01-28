//! Given two strings s and t , write a function to determine if t is an anagram of s.
//!
//! Example 1:
//!
//! Input: s = "anagram", t = "nagaram"
//! Output: true
//!
//! Example 2:
//!
//! Input: s = "rat", t = "car"
//! Output: false
//!
//! Note:
//! You may assume the string contains only lowercase alphabets.
//!
//! Follow up:
//! What if the inputs contain unicode characters? How would you adapt your solution to such case?
use std::collections::HashMap;

struct Solution;

impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        let mut s_map = HashMap::new();
        let mut t_map = HashMap::new();

        s.chars().into_iter().for_each(|c| {
            *s_map.entry(c).or_insert(0) += 1;
        });

        t.chars().into_iter().for_each(|c| {
            *t_map.entry(c).or_insert(0) += 1;
        });

        s_map == t_map
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::is_anagram(String::from("anagram"), String::from("nagaram")), true);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::is_anagram(String::from("rat"), String::from("car")), false);
    }
}