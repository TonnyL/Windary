package MultiplyStrings

import (
	"strconv"
	"strings"
)

//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
//
//Note:
//
//The length of both num1 and num2 is < 110.
//Both num1 and num2 contains only digits 0-9.
//Both num1 and num2 does not contain any leading zero.
//You must not use any built-in BigInteger library or convert the inputs to integer directly.
//
//Accepted.

func multiply(num1 string, num2 string) string {
	num1Length, num2Length := len(num1), len(num2)
	ints := make([]int, num1Length+num2Length)
	for i := num1Length - 1; i >= 0; i-- {
		for j := num2Length - 1; j >= 0; j-- {
			ints[(num1Length-i-1)+(num2Length-j-1)] += int(num1[i]-'0') * int(num2[j]-'0')
		}
	}

	res := make([]string, 0)
	for i := 0; i < num1Length+num2Length; i++ {
		digit := ints[i] % 10
		carry := ints[i] / 10
		tmp := make([]string, 1)
		tmp[0] = strconv.Itoa(digit)

		res = append(tmp, res...)
		if i < (num1Length + num2Length - 1) {
			ints[i+1] += carry
		}
	}

	for ; len(res) > 0 && res[0] == "0"; {
		res = removeIndex(res, 0)
	}

	if len(res) == 0 {
		return "0"
	}
	return strings.Join(res, "")
}

func removeIndex(s []string, index int) []string {
	return append(s[:index], s[index+1:]...)
}
