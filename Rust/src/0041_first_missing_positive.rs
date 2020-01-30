//! Given an unsorted integer array, find the smallest missing positive integer.
//!
//! ```
//! Example 1:
//!
//! Input: [1,2,0]
//! Output: 3
//! ```
//!
//! ```
//! Example 2:
//!
//! Input: [3,4,-1,1]
//! Output: 2
//! ```
//!
//! ```
//! Example 3:
//!
//! Input: [7,8,9,11,12]
//! Output: 1
//! ```
//!
//! Note:
//!
//! Your algorithm should run in O(n) time and uses constant extra space.
//!
struct Solution;

impl Solution {
    pub fn first_missing_positive(mut nums: Vec<i32>) -> i32 {
        let mut result = 1;

        nums.sort();

        nums.iter().for_each(|num| {
            if *num == result {
                result += 1;
            }
        });

        result
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::first_missing_positive(vec![1, 2, 0]), 3);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::first_missing_positive(vec![3, 4, -1, 1]), 2);
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::first_missing_positive(vec![7, 8, 9, 11, 12]), 1);
    }
}