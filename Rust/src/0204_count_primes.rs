//! Count the number of prime numbers less than a non-negative number, n.
//!
//! ```
//! Example:
//!
//! Input: 10
//! Output: 4
//! Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//! ```
//!
//! https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
//!
struct Solution;

impl Solution {
    pub fn count_primes(n: i32) -> i32 {
        let mut is_prime: Vec<bool> = vec![false; n as usize];
        let mut count = 0;

        for i in 2..n {
            if !is_prime[(i - 1) as usize] {
                count += 1;

                // stack over flow here if use i as i32, wtf.
                let mut j = (i as i128) * (i as i128);
                while j < n as i128 {
                    is_prime[(j - 1) as usize] = true;

                    j += i as i128;
                }
            }
        }

        count
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::count_primes(10), 4);
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::count_primes(2), 0);
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::count_primes(10000), 1229);
    }
}
