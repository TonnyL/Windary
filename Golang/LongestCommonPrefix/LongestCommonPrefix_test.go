package LongestCommonPrefix

import "testing"

func TestLongestCommonPrefix(t *testing.T) {

	if longestCommonPrefix([]string{}) == "" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if longestCommonPrefix([]string{"abc"}) == "abc" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if longestCommonPrefix([]string{"abcf", "abcd", "abcdefg"}) == "abc" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if longestCommonPrefix([]string{"aa", "a"}) == "a" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
