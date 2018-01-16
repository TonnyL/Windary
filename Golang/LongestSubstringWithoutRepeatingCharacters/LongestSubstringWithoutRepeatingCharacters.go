package LongestSubstringWithoutRepeatingCharacters

//Given a string, find the length of the longest substring without repeating characters.
//Examples:
//
//Given "abcabcbb", the answer is "abc", which the length is 3.
//Given "bbbbb", the answer is "b", with the length of 1.
//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//Result: Accepted

func lengthOfLongestSubstring(s string) int {
	sLength := len(s)
	if sLength == 0 {
		return 0
	}

	var result = ""
	var tmp = ""
	inputChars := []byte(s)

	for i := 0; i < len(inputChars); i++ {
		for j := 0; j < len(tmp); j++ {
			if inputChars[i] == (tmp[j]) {
				tmp = string(tmp[j+1:])
				break
			}
		}

		tmp += string(inputChars[i])

		if len(tmp) > len(result) {
			result = tmp
		}
	}

	return len(result)
}
