//! Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//!
//! Example 1:
//! ```
//! Input: [3,0,1]
//! Output: 2
//! ```
//!
//! Example 2:
//! ```
//! Input: [9,6,4,2,3,5,7,0,1]
//! Output: 8
//! ```
//!
//! Note:
//! Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
//!

struct Solution;

impl Solution {
    pub fn missing_number(nums: Vec<i32>) -> i32 {
        let len = (nums.len() + 1) as i32;
        let sum: i32 = nums.iter().sum();
        match len {
            1..=2 => { // not a good idea but works
                len - 1 - sum
            }
            3 => {
                len - sum
            }
            _ => {
                let s = if len % 2 == 0 {
                    (len - 1) * (len / 2)
                } else {
                    len * (len - 1)
                };

                s - sum
            }
        }
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::missing_number(vec![3, 0, 1]), 2);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::missing_number(vec![9, 6, 4, 2, 3, 5, 7, 0, 1]), 8);
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::missing_number(vec![1]), 0);
    }
}