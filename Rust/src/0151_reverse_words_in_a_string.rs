//! Given an input string, reverse the string word by word.
//!
//!
//!
//! Example 1:
//!
//! Input: "the sky is blue"
//! Output: "blue is sky the"
//!
//! Example 2:
//!
//! Input: "  hello world!  "
//! Output: "world! hello"
//! Explanation: Your reversed string should not contain leading or trailing spaces.
//!
//! Example 3:
//!
//! Input: "a good   example"
//! Output: "example good a"
//! Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
//!
//!
//!
//! Note:
//!
//! A word is defined as a sequence of non-space characters.
//! Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
//! You need to reduce multiple spaces between two words to a single space in the reversed string.
//!
struct Solution;

impl Solution {
    pub fn reverse_words(s: String) -> String {
        let mut words: Vec<&str> = s.split(' ').collect();
        words.iter()
            .rev()
            .filter(|word| {
                !(**word).is_empty()
            })
            .map(|word| {
                *word
            })
            .collect::<Vec<&str>>()
            .join(" ")
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_0() {
        assert_eq!(Solution::reverse_words(String::from("the sky is blue")), String::from("blue is sky the"));
    }

    #[test]
    fn test_1() {
        assert_eq!(Solution::reverse_words(String::from("  hello world!  ")), String::from("world! hello"));
    }

    #[test]
    fn test_2() {
        assert_eq!(Solution::reverse_words(String::from("a good   example")), String::from("example good a"));
    }
}