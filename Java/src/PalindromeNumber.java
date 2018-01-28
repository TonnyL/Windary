/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p>
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * There is a more generic way of solving this problem.
 * <p>
 * Accepted.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 10 && x >= 0) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }

        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x /= 10;
        }

        return x == y || x == y / 10;
    }

}
