package LetterCombinationsOfAPhoneNumber

import "strconv"

//Given a digit string, return all possible letter combinations that the number could represent.
//
//A mapping of digit to letters (just like on the telephone buttons) is given below.
//
//Input:Digit string "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
//Note:
//Although the above answer is in lexicographical order, your answer could be in any order you want.
//
//Accepted.

func letterCombinations(digits string) []string {
	dict := []string{" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}
	results := make([]string, 0)

	digitsLength := len(digits)
	if digitsLength == 0 {
		return results
	}

	if digitsLength == 1 {
		i, _ := strconv.Atoi(digits)
		for _, c := range dict[i] {
			results = append(results, string(c))
		}
		return results
	}

	list := letterCombinations(string(digits[1:digitsLength]))

	builder := ""

	i, _ := strconv.Atoi(digits[0:1])
	for _, c := range dict[i] {
		for _, s := range list {
			builder += string(c)
			builder += s
			results = append(results, builder)
			builder = ""
		}
	}

	return results
}
