package PlusOne

//Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
//You may assume the integer do not contain any leading zero, except the number 0 itself.
//The digits are stored such that the most significant digit is at the head of the list.
//
//Accepted.

func plusOne(digits []int) []int {
	flag := false
	digitsLength := len(digits)
	digits[digitsLength-1]++

	for i := digitsLength - 1; i >= 0; i-- {
		if flag {
			digits[i]++
		}
		if digits[i] >= 10 {
			flag = true
			digits[i] %= 10
		} else {
			flag = false
		}
	}

	if flag {
		tmp := []int{1,}
		tmp = append(tmp, digits...)
		return tmp
	}

	return digits
}
