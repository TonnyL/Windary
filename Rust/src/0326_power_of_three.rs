//! Given an integer, write a function to determine if it is a power of three.
//!
//! ```
//! Example 1:
//!
//! Input: 27
//! Output: true
//! ```
//!
//! ```
//! Example 2:
//!
//! Input: 0
//! Output: false
//! ```
//!
//! ```
//! Example 3:
//!
//! Input: 9
//! Output: true
//! ```
//!
//! ```
//! Example 4:
//!
//! Input: 45
//! Output: false
//! ```
//!
//! Follow up:
//! Could you do it without using any loop / recursion?
use std::collections::HashSet;

struct Solution {}

impl Solution {
    pub fn is_power_of_three(n: i32) -> bool {
        match n {
            1 => {
                true
            }
            2 => {
                false
            }
            _ => {
                let mut r: i64 = 3;
                while r < (n as i64) {
                    r *= 3;
                }

                r == (n as i64)
            }
        }
    }

    pub fn is_power_of_three2(n: i32) -> bool {
        let mut set: HashSet<i32> = [
            1, 3, 9, 27,
            81, 243, 729, 2187,
            6561, 19683, 59049, 177147,
            531441, 1594323, 4782969, 14348907,
            43046721, 129140163, 387420489, 1162261467
        ].iter().cloned().collect();

        set.contains(&n)
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::is_power_of_three(27), true);
        assert_eq!(Solution::is_power_of_three2(27), true);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::is_power_of_three(0), false);
        assert_eq!(Solution::is_power_of_three2(0), false);
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::is_power_of_three(9), true);
        assert_eq!(Solution::is_power_of_three2(9), true);
    }

    #[test]
    fn test_3() {
        assert_eq!(Solution::is_power_of_three(45), false);
        assert_eq!(Solution::is_power_of_three2(45), false);
    }

    #[test]
    fn test_4() {
        assert_eq!(Solution::is_power_of_three(1), true);
        assert_eq!(Solution::is_power_of_three2(1), true);
    }
}