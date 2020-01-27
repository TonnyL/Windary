//! Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//!
//! (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
//!
//! Find the minimum element.
//!
//! The array may contain duplicates.
//!
//! ```
//! Example 1:
//!
//! Input: [1,3,5]
//! Output: 1
//! ```
//!
//! ```
//! Example 2:
//!
//! Input: [2,2,2,0,1]
//! Output: 0
//! ```
//!
//! Note:
//!
//! This is a follow up problem to Find Minimum in Rotated Sorted Array.
//! Would allow duplicates affect the run-time complexity? How and why?
//!
struct Solution;

// same as 0153_find_minimum_in_rotated_sorted_array.rs
impl Solution {
    pub fn find_min(nums: Vec<i32>) -> i32 {
        let mut min = nums[0];
        let mut max = nums[0];

        for index in 0..nums.len() {
            if nums[index] < max {
                min = nums[index];
                break;
            } else {
                max = nums[index];
            }
        }

        min
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::find_min(vec![1, 3, 5]), 1);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::find_min(vec![2,2,2,0,1]), 0);
    }
}