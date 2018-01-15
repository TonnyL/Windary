package StringToIntegerAtoi

//Implement atoi to convert a string to an integer.
//
//Hint: Carefully consider all possible input cases. If you want a challenge,
//please do not see below and ask yourself what are the possible input cases.
//
//Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
//You are responsible to gather all the input requirements up front.
//
//Accepted.

import (
	"strconv"
	"strings"
)

const intMaxValue = 2147483647
const intMinValue = -2147483648

func myAtoi(str string) int {
	s := strings.Trim(str, " ")
	stringLength := len(s)
	if stringLength == 0 {
		return 0
	}
	if stringLength == 1 {
		if s[0] <= '0' || s[0] >= '9' {
			return 0
		}
		r, _ := strconv.Atoi(s)
		return r
	}

	plus, minus := s[0] == '+', s[0] == '-'

	result, startIndex := 0, 0
	if plus || minus {
		startIndex = 1
	}

	for i := startIndex; i < stringLength; i++ {
		if s[i] >= '0' && s[i] <= '9' {
			if intMaxValue/10-int(s[i]-'0') <= result {
				if minus && result*10+int(s[i]-'0') == intMaxValue {
					return -intMaxValue
				}
				if minus {
					return intMinValue
				}
				return intMaxValue
			}
			result = result*10 + int(s[i]-'0')
		} else {
			if minus {
				return -result
			}
			return result
		}
	}

	if minus {
		return -result
	}
	return result

}
