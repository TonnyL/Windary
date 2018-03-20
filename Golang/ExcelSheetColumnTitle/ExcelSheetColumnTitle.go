package ExcelSheetColumnTitle

//Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//
//For example:
//
//1 -> A
//2 -> B
//3 -> C
//...
//26 -> Z
//27 -> AA
//28 -> AB
//
//Accepted.

import (
	"strings"
)

func convertToTitle(n int) string {
	var builder []string

	for ; n != 0; {
		if n%26 == 0 {
			builder = append(builder, "Z")
			n -= 26
		} else {
			builder = append(builder, string(n%26-1+'A'))
			n -= n % 26
		}
		n /= 26
	}

	// reverse the string array.
	for i, j := 0, len(builder)-1; i < j; i, j = i+1, j-1 {
		builder[i], builder[j] = builder[j], builder[i]
	}

	return strings.Join(builder, "")
}
