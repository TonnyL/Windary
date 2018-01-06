package ValidParentheses

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
//determine if the input string is valid.
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
//Accepted.

func isValid(s string) bool {
	if len(s) == 0 || len(s) == 1 {
		return false
	}

	stack := make([]int32, 0)

	for _, char := range s {
		if len(stack) != 0 && (char == ')' && stack[len(stack)-1] == '(' || char == ']' && stack[len(stack)-1] == '[' || char == '}' && stack[len(stack)-1] == '{') {
			stack = append(stack[:len(stack)-1], stack[len(stack):]...)
		} else {
			stack = append(stack, char)
		}
	}

	return len(stack) == 0
}
