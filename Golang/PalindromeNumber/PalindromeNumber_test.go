package PalindromeNumber

import "testing"

func TestIsPalindrome(t *testing.T) {

	if isPalindrome(-1) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isPalindrome(1) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isPalindrome(121) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isPalindrome(1001) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isPalindrome(1000021) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
