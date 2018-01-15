package ImplementStrStr

//Implement strStr().
//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//Accepted.

func strStr(haystack string, needle string) int {
	needleLength := len(needle)
	haystackLength := len(haystack)
	if needleLength > haystackLength {
		return -1
	}

	if haystackLength == 0 || needleLength == 0 {
		return 0
	}

	for i := 0; i <= haystackLength-needleLength; i++ {
		if haystack[i:i+needleLength] == (needle) {
			return i
		}
	}

	return -1
}
