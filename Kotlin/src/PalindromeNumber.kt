/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * There is a more generic way of solving this problem.
 */
class PalindromeNumber {

    fun isPalindrome(num: Int): Boolean {
        var x = num
        if (x in 0..9) return true
        if (x % 10 == 0) return false

        var y = 0
        while (x > y) {
            y = y * 10 + x % 10
            x /= 10
        }

        return x == y || x == y / 10
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val pn = PalindromeNumber()

            // Expected: false
            println(pn.isPalindrome(-1))
            // Expected: true
            println(pn.isPalindrome(1))
            // Expected: true
            println(pn.isPalindrome(121))
            // Expected: true
            println(pn.isPalindrome(1001))
            // Expected: false
            println(pn.isPalindrome(1000021))
        }
    }

}