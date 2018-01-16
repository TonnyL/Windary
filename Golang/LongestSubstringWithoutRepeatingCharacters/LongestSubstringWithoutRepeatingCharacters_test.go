package LongestSubstringWithoutRepeatingCharacters

import "testing"

func TestLengthOfLongestSubstring(t *testing.T) {

	if lengthOfLongestSubstring("pwwkew") == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if lengthOfLongestSubstring("bbbbbb") == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if lengthOfLongestSubstring("abcabcbb") == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if lengthOfLongestSubstring("dvdf") == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
