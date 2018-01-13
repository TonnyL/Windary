package RomanToInteger

//Given a roman numeral, convert it to an integer.
//Input is guaranteed to be within the range from 1 to 3999.
//
//Accepted.

func romanToInt(s string) int {
	dict := map[byte]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}

	chars := []byte(s)
	result := 0

	length := len(chars)
	for i := 0; i < length; i++ {
		if i+1 < length && dict[chars[i+1]] > dict[chars[i]] && (chars[i] == 'I' || chars[i] == 'X' || chars[i] == 'C') {
			result += dict[chars[i+1]] - dict[chars[i]]
			i++
		} else {
			result += dict[chars[i]]
		}
	}

	return result
}
