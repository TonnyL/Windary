package LongestCommonPrefix

//Write a function to find the longest common prefix string amongst an array of strings.
//
//Accepted.

func longestCommonPrefix(strs []string) string {
	if strs == nil || len(strs) == 0 {
		return ""
	}

	if len(strs) == 1 {
		return strs[0]
	}

	for i := 0; i < len(strs[0]); i++ {
		for j := 1; j < len(strs); j++ {
			if i == len(strs[j]) || strs[0][i] != strs[j][i] {
				return string(strs[0][0:i])
			}
		}
	}
	return strs[0]
}
