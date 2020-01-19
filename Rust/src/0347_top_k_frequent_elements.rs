//! Given a non-empty array of integers, return the k most frequent elements.
//!
//! Example 1:
//!
//! Input: nums = [1,1,1,2,2,3], k = 2
//! Output: [1,2]
//!
//! Example 2:
//!
//! Input: nums = [1], k = 1
//! Output: [1]
//!
//! Note:
//!
//! + You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
//! + Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
//!
use std::collections::{BTreeMap, HashMap};
use std::option::Option::Some;

struct Solution;

impl Solution {
    pub fn top_k_frequent(nums: Vec<i32>, k: i32) -> Vec<i32> {
        let mut number_to_frequency_map: HashMap<i32, i32> = HashMap::new();
        nums.iter().for_each(|i| {
            *number_to_frequency_map.entry(*i).or_insert(0) += 1;
        });

        let mut frequency_to_numbers_map: BTreeMap<i32, Vec<i32>> = BTreeMap::new();
        number_to_frequency_map.iter().for_each(|(key, value)| {
            if let Some(old) = frequency_to_numbers_map.get_mut(value) {
                old.insert(old.len(), *key);
            } else {
                frequency_to_numbers_map.insert(*value, vec![*key]);
            }
        });

        let mut result: Vec<i32> = vec![];
        for (_, value) in frequency_to_numbers_map.iter().rev() {
            value.iter().for_each(|v| {
                result.insert(result.len(), *v);
            });

            if (result.len() as i32) >= k {
                break;
            }
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
        assert_eq!(
            BTreeSet::from_iter(Solution::top_k_frequent(vec![1, 1, 1, 2, 2, 3], 2)),
            BTreeSet::from_iter(vec![1, 2])
        );
    }

    #[test]
    fn test_1() {
        assert_eq!(
            BTreeSet::from_iter(Solution::top_k_frequent(vec![1], 1)),
            BTreeSet::from_iter(vec![1])
        );
    }

    #[test]
    fn test_2() {
        assert_eq!(
            BTreeSet::from_iter(Solution::top_k_frequent(vec![1, 2], 2)),
            BTreeSet::from_iter(vec![1, 2])
        );
    }
}
