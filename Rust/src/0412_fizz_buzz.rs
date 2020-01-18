//! Write a program that outputs the string representation of numbers from 1 to n.
//!
//! But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
//!
//! Example:
//!
//! n = 15,
//!
//! Return:
//! [
//! "1",
//! "2",
//! "Fizz",
//! "4",
//! "Buzz",
//! "Fizz",
//! "7",
//! "8",
//! "Fizz",
//! "Buzz",
//! "11",
//! "Fizz",
//! "13",
//! "14",
//! "FizzBuzz"
//! ]
//!
struct Solution;

impl Solution {
    pub fn fizz_buzz(n: i32) -> Vec<String> {
        let mut result: Vec<String> = vec![];
        for i in 1..(n + 1) {
            let len = result.len();
            if i % 15 == 0 {
                result.insert(len, String::from("FizzBuzz"));
            } else if i % 3 == 0 {
                result.insert(len, String::from("Fizz"));
            } else if i % 5 == 0 {
                result.insert(len, String::from("Buzz"));
            } else {
                result.insert(len, i.to_string());
            }
        }

        result
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test() {
        assert_eq!(Solution::fizz_buzz(15), vec![
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz"
        ])
    }
}