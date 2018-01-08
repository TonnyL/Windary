package DecodeWays

//A message containing letters from A-Z is being encoded to numbers using the following mapping:
//
//'A' -> 1
//'B' -> 2
//...
//'Z' -> 26
//Given an encoded message containing digits, determine the total number of ways to decode it.
//
//For example,
//Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
//
//The number of ways decoding "12" is 2.
//
//Accepted.

func numDecodings(s string) int {
	if len(s) == 0 || s[0] == '0' {
		return 0
	}

	ints := make([]int, len(s)+1)
	ints[0] = 1

	for i := 1; i < len(ints); i++ {
		if s[i-1] == '0' {
			ints[i] = 0
		} else {
			ints[i] = ints[i-1]
		}

		if i > 1 && (s[i-2] == '1' || (s[i-2] == '2' && int(s[i-1]) <= int('6'))) {
			ints[i] += ints[i-2]
		}

	}

	return ints[len(s)]
}
