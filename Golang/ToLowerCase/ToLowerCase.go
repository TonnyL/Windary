package ToLowerCase

//Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
//
//Example 1:
//
//Input: "Hello"
//Output: "hello"
//Example 2:
//
//Input: "here"
//Output: "here"
//Example 3:
//
//Input: "LOVELY"
//Output: "lovely"
//
//Accepted.

func toLowerCase(str string) string {
	//return strings.ToLower(str)
	result := ""
	for i := 0; i < len(str); i++ {
		if str[i] >= 65 && str[i] <= 90 {
			result += string(rune(int(str[i]) + 32))
		} else {
			result += string(str[i])
		}
	}

	return result
}
