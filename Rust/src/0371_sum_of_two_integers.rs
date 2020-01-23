//! Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
//!
//! ```
//! Example 1:
//!
//! Input: a = 1, b = 2
//! Output: 3
//! ```
//!
//! ```
//! Example 2:
//!
//! Input: a = -2, b = 3
//! Output: 1
//! ```
//!
struct Solution;

impl Solution {
    pub fn get_sum(mut a: i32, mut b: i32) -> i32 {
        while a != 0 {
            let tmp = (a & b) << 1;
            b ^= a;
            a = tmp;
        }

        b
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::get_sum(1, 2), 3);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::get_sum(-2, 3), 1);
    }

}