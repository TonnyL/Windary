//! Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//!
//! Example:
//!
//! Input: [0,1,0,3,12]
//! Output: [1,3,12,0,0]
//!
//! Note:
//!
//! 1. You must do this in-place without making a copy of the array.
//! 2. Minimize the total number of operations.
//!
struct Solution;

impl Solution {
    pub fn move_zeroes(nums: &mut Vec<i32>) {
        let original_len = nums.len();
        // nums.remove_item(&0);
        nums.retain(|i| *i != 0);

        while nums.len() < original_len {
            nums.insert(nums.len(), 0);
        }
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        let mut original = vec![0, 1, 0, 3, 12];
        Solution::move_zeroes(&mut original);
        assert_eq!(original, vec![1, 3, 12, 0, 0])
    }
}
