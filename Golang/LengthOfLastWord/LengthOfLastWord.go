package LengthOfLastWord

import (
	"strings"
)

//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//If the last word does not exist, return 0.
//Note: A word is defined as a character sequence consists of non-space characters only.
//For example,
//Given s = "Hello World",
//return 5.
//
//Accepted.

func lengthOfLastWord(s string) int {
	if len(s) == 0 {
		return 0
	}

	strs := strings.Split(strings.Trim(s, " "), " ")
	if len(strs) == 0 {
		return 0
	}

	return len(strs[len(strs)-1])
}
