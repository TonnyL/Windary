package GenerateParentheses

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//For example, given n = 3, a solution set is:
//
//[
//"((()))",
//"(()())",
//"(())()",
//"()(())",
//"()()()"
//]
//
//Accepted.

func generateParenthesis(n int) []string {
	set := make(map[string]bool, 0)
	list := make([]string, 0)
	if n <= 0 {
		return list
	}

	if n == 1 {
		list = append(list, "()")
		return list
	}

	for _, s := range generateParenthesis(n - 1) {
		str := ""
		chars := []byte(s)

		for j := 0; j < len(chars); j++ {
			str += string(chars[j])
			if chars[j] == '(' {
				builder := str
				builder += "()"

				for k := j + 1; k < len(chars); k++ {
					builder += string(chars[k])
				}
				set[builder] = true
			}
		}

		set[s+"()"] = true
	}

	for k := range set {
		list = append(list, k)
	}

	return list
}
