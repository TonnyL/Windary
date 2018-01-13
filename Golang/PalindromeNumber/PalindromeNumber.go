package PalindromeNumber

//Determine whether an integer is a palindrome. Do this without extra space.
//
//Some hints:
//Could negative integers be palindromes? (ie, -1)
//If you are thinking of converting the integer to string, note the restriction of using extra space.
//You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
//There is a more generic way of solving this problem.
//
//Accepted.

func isPalindrome(x int) bool {
	if x < 10 && x >= 0 {
		return true
	}
	if x%10 == 0 {
		return false
	}

	y := 0
	for ; x > y; {
		y = y*10 + x%10
		x /= 10
	}

	return x == y || x == y/10
}
