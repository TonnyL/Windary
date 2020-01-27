//! Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//!
//! (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
//!
//! Find the minimum element.
//!
//! You may assume no duplicate exists in the array.
//!
//! ```
//! Example 1:
//!
//! Input: [3,4,5,1,2]
//! Output: 1
//! ```
//!
//! ```
//! Example 2:
//!
//! Input: [4,5,6,7,0,1,2]
//! Output: 0
//! ```
//!
struct Solution;

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
        assert_eq!(Solution::find_min(vec![3, 4, 5, 1, 2]), 1);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::find_min(vec![4, 5, 6, 7, 0, 1, 2]), 0);
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::find_min(vec![1, 2]), 1);
    }
}