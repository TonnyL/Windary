//! Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
//!
//! Note that it is the kth smallest element in the sorted order, not the kth distinct element.
//!
//! Example:
//!
//! matrix = [
//! [ 1,  5,  9],
//! [10, 11, 13],
//! [12, 13, 15]
//! ],
//! k = 8,
//!
//! return 13.
//!
//! Note:
//! You may assume k is always valid, 1 ≤ k ≤ n2.
struct Solution;

impl Solution {
    pub fn kth_smallest(matrix: Vec<Vec<i32>>, k: i32) -> i32 {
        let mut vec: Vec<i32> = vec![];
        matrix.iter().for_each(|v| {
            v.iter().for_each(|&i| {
                vec.insert(vec.len(), i);
            })
        });

        vec.sort();

        vec[(k - 1) as usize]
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::kth_smallest(
            vec![
                vec![1, 5, 9],
                vec![10, 11, 13],
                vec![12, 13, 15]
            ],
            8,
        ), 13)
    }
}