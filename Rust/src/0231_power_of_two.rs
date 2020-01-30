//! Given an integer, write a function to determine if it is a power of two.
//!
//! ```
//! Example 1:
//!
//! Input: 1
//! Output: true
//! Explanation: 20 = 1
//! ```
//!
//! ```
//! Example 2:
//!
//! Input: 16
//! Output: true
//! Explanation: 24 = 16
//! ```
//!
//! ```
//! Example 3:
//!
//! Input: 218
//! Output: false
//! ```
//!
struct Solution;

impl Solution {
    pub fn is_power_of_two(n: i32) -> bool {
        if n <= 0 {
            return false;
        }

        (n&(n-1)) == 0
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::is_power_of_two(1), true);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::is_power_of_two(16), true);
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::is_power_of_two(218), false);
    }
}