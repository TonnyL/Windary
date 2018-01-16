package AddBinary

//Given two binary strings, return their sum (also a binary string).
//
//For example,
//a = "11"
//b = "1"
//Return "100".
//
//Accepted.

func addBinary(a string, b string) string {
	aLength, bLength := len(a), len(b)
	if aLength == 0 {
		return b
	}
	if bLength == 0 {
		return a
	}

	flag := false
	longer := []byte(a)
	if bLength > aLength {
		longer = []byte(b)
	}
	shorter := []byte(b)
	if aLength < bLength {
		shorter = []byte(a)
	}

	result := ""
	var i = len(longer) - 1
	var j = len(shorter) - 1

	for ; i >= 0; {
		if j < 0 {
			if longer[i] == '1' {
				if flag {
					result += "0"
				} else {
					result += "1"
				}
			} else {
				if flag {
					result += "1"
					flag = false
				} else {
					result += "0"
				}
			}
		} else {
			if longer[i] == '1' && shorter[j] == '1' {
				if flag {
					result += "1"
				} else {
					result += "0"
				}
				flag = true
			} else if longer[i] == '0' && shorter[j] == '0' {
				if flag {
					result += "1"
				} else {
					result += "0"
				}
				flag = false
			} else {
				if flag {
					result += "0"
					flag = true
				} else {
					result += "1"
				}
			}
		}

		i -= 1
		j -= 1
	}

	if flag {
		result += "1"
	}

	return reverse(result)
}

func reverse(s string) string {
	n := len(s)
	runes := make([]rune, n)
	for _, r := range s {
		n--
		runes[n] = r
	}
	return string(runes[n:])
}
