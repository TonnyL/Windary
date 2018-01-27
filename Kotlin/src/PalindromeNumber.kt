/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * There is a more generic way of solving this problem.
 *
 * Accepted.
 */
class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        var num = x
        if (num in 0..9) {
            return true
        }
        if (num % 10 == 0) {
            return false
        }

        var y = 0
        while (num > y) {
            y = y * 10 + num % 10
            num /= 10
        }

        return num == y || num == y / 10
    }

}