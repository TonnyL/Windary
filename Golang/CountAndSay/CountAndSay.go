package CountAndSay

import (
	"strconv"
	"strings"
)

//The count-and-say sequence is the sequence of integers with the first five terms as following:
//
//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n, generate the nth term of the count-and-say sequence.
//
//Note: Each term of the sequence of integers will be represented as a string.
//
//Example 1:
//
//Input: 1
//Output: "1"
//Example 2:
//
//Input: 4
//Output: "1211"
//
//Accepted.

func countAndSay(n int) string {
	if n <= 0 {
		return "0"
	}
	if n == 1 {
		return "1"
	}

	result := make([]string, 0)
	chars := []byte(countAndSay(n - 1))
	for i := 0; i < len(chars)-1; i++ {
		count := 1
		for ; i+1 < len(chars) && chars[i] == chars[i+1]; {
			count++
			i++
		}
		result = append(result, strconv.Itoa(count))
		result = append(result, string(chars[i]))
	}

	if len(chars)-2 >= 0 && chars[len(chars)-1] == chars[len(chars)-2] {
		resultLength := len(result)
		s, _ := strconv.Atoi(result[resultLength-2])
		result[resultLength-2] = strconv.Itoa(s)
	} else {
		result = append(result, string(chars[len(chars)-1]))
		result = append(result, "1")
	}

	return strings.Join(result, "")
}
