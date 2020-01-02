//! Write a function that reverses a string. The input string is given as an array of characters char[].
//!
//! Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//!
//! You may assume all the characters consist of printable ascii characters.
//!
//!
//!
//! Example 1:
//! ```
//! Input: ["h","e","l","l","o"]
//! Output: ["o","l","l","e","h"]
//! ```
//!
//! Example 2:
//! ```
//! Input: ["H","a","n","n","a","h"]
//! Output: ["h","a","n","n","a","H"]
//! ```
//!

struct Solution;

impl Solution {
    pub fn reverse_string(s: &mut Vec<char>) {
        let len = s.len();
        if len > 0 {
            let mut midpoint = if len % 2 == 0 {
                len / 2
            } else {
                len / 2 + 1
            };
            for start in 0..midpoint {
                let end = len - start - 1;
                let tmp = s[start];
                s[start] = s[end];
                s[end] = tmp;
            }
        }
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        let mut vec = &mut vec!['h', 'e', 'l', 'l', 'o'];
        Solution::reverse_string(vec);
        let res = vec!['o', 'l', 'l', 'e', 'h'];
        for (index, val) in vec.iter().enumerate() {
            assert_eq!(*val, res[index]);
        }
    }

    #[test]
    fn test_1() {
        let mut vec = &mut vec!['H', 'a', 'n', 'n', 'a', 'h'];
        Solution::reverse_string(vec);
        let res = vec!['h', 'a', 'n', 'n', 'a', 'H'];
        for (index, val) in vec.iter().enumerate() {
            assert_eq!(*val, res[index]);
        }
    }
}