//! Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
//!
//! Example 1:
//!
//! Input: [3,2,1,5,6,4] and k = 2
//! Output: 5
//!
//! Example 2:
//!
//! Input: [3,2,3,1,2,4,5,5,6] and k = 4
//! Output: 4
//!
//! Note:
//! You may assume k is always valid, 1 ≤ k ≤ array's length.
struct Solution {}

impl Solution {
    pub fn find_kth_largest(mut nums: Vec<i32>, k: i32) -> i32 {
        nums.sort();

        let mut i = 1;
        for value in nums.iter().rev() {
            if k == i {
                return *value as i32;
            }

            i += 1;
        }

        0
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::find_kth_largest(vec![3, 2, 1, 5, 6, 4], 2), 5);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::find_kth_largest(vec![3, 2, 3, 1, 2, 4, 5, 5, 6], 4), 4);
    }
}
