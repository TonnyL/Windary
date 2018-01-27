/**
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 *
 * Example:
 *
 * Input: "babad"
 *
 * Output: "bab"
 *
 * Note: "aba" is also a valid answer.
 * Example:
 *
 * Input: "cbbd"
 *
 * Output: "bb"
 *
 * Accepted.
 */
class LongestPalindromicSubstring {

    fun longestPalindrome(s: String?): String? {
        if (s == null || s.length <= 1) {
            return s
        }

        var maxLength = 0
        var startIndex = 0
        for (index in 0 until s.length) {
            var leftIndex = index
            var rightIndex = index
            while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] == s[rightIndex]) {
                val current = rightIndex - leftIndex + 1
                if (current > maxLength) {
                    maxLength = current
                    startIndex = leftIndex
                }
                leftIndex--
                rightIndex++
            }

            leftIndex = index
            rightIndex = index + 1
            while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] == s[rightIndex]) {
                val current = rightIndex - leftIndex + 1
                if (current > maxLength) {
                    maxLength = current
                    startIndex = leftIndex
                }
                leftIndex--
                rightIndex++
            }
        }

        return s.substring(startIndex, maxLength + startIndex)
    }

}
