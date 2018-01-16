package LongestPalindromicSubstring

import "testing"

func TestLongestPalindrome(t *testing.T) {

	s := longestPalindrome("babad")
	if s == "bab" || s == "aba" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if longestPalindrome("cbbd") == "bb" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if longestPalindrome("babaddtattarrattatddetartrateedredividerb") == "ddtattarrattatdd" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
