//! Given an array of integers, find if the array contains any duplicates.
//!
//! Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//! 
//! Example 1:
//! ```
//! Input: [1,2,3,1]
//! Output: true
//! ```
//!
//! Example 2:
//!
//! ```
//! Input: [1,2,3,4]
//! Output: false
//! ```
//!
//! Example 3:
//! ```
//! Input: [1,1,1,3,3,4,3,2,4,2]
//! Output: true
//! ```
//!

use std::collections::HashSet;
use std::iter::FromIterator;

struct Solution;

impl Solution {
    pub fn contains_duplicate(nums: Vec<i32>) -> bool {
        let map: HashSet<i32> = HashSet::from_iter(nums.clone());
        nums.len() != map.len()
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::contains_duplicate(vec![1, 2, 3, 1]), true);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::contains_duplicate(vec![1, 2, 3, 4]), false);
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::contains_duplicate(vec![1, 1, 1, 3, 3, 4, 3, 2, 4, 2]), true)
    }
}