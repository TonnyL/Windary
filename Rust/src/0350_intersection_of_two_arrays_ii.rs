//! Given two arrays, write a function to compute their intersection.
//!
//! ```
//! Example 1:
//!
//! Input: nums1 = [1,2,2,1], nums2 = [2,2]
//! Output: [2,2]
//! ```
//!
//! ```
//! Example 2:
//!
//! Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//! Output: [4,9]
//! ```
//!
//! Note:
//!
//! Each element in the result should appear as many times as it shows in both arrays.
//! The result can be in any order.
//!
//! Follow up:
//!
//! What if the given array is already sorted? How would you optimize your algorithm?
//! What if nums1's size is small compared to nums2's size? Which algorithm is better?
//! What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
//!
use std::collections::HashMap;

struct Solution;

impl Solution {
    pub fn intersect(mut nums1: Vec<i32>, mut nums2: Vec<i32>) -> Vec<i32> {
        let mut result: Vec<i32> = vec![];

        let mut nums1_value_to_time: HashMap<i32, i32> = HashMap::new();
        nums1.iter().for_each(|v| {
            *nums1_value_to_time.entry(*v).or_insert(0) += 1;
        });

        let mut index = 0;
        while index < nums2.len() {
            if let Some(v) = nums1_value_to_time.get_mut(&nums2[index]) {
                if *v == 1 {
                    nums1_value_to_time.remove_entry(&nums2[index]);
                } else {
                    *v -= 1;
                }

                result.insert(result.len(), nums2[index]);
            }

            index += 1;
        }

        result
    }
}

#[cfg(test)]
mod tests {
    use std::collections::BTreeSet;
    use std::iter::FromIterator;

    use super::Solution;

    #[test]
    fn test_0() {
        let intersection = Solution::intersect(vec![1, 2, 2, 1], vec![2, 2]);
        let expectation = vec![2, 2];
        let intersection_len = intersection.len();
        let expectation_len = expectation.len();
        assert_eq!(intersection_len, expectation_len);
        assert_eq!(BTreeSet::from_iter(intersection), BTreeSet::from_iter(expectation));
    }

    #[test]
    fn test_1() {
        let intersection = Solution::intersect(vec![4, 9, 5], vec![9, 4, 9, 8, 4]);
        let expectation = vec![4, 9];
        let intersection_len = intersection.len();
        let expectation_len = expectation.len();
        assert_eq!(intersection_len, expectation_len);
        assert_eq!(BTreeSet::from_iter(intersection), BTreeSet::from_iter(expectation));
    }
}