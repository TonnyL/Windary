package ReverseInteger

//Reverse digits of an integer.
//
//Example1: x = 123, return 321
//Example2: x = -123, return -321
//
//Have you thought about this?
//Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
//If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
//Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows.
//How should you handle such cases?
//For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
//
//Note:
//The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
//
//Accepted.

const intMaxValue = 2147483647
const intMinValue = -2147483648

func reverse(x int) int {
	if x == 0 {
		return 0
	}

	var result int64 = 0
	for ; x != 0; {
		result = result*10 + int64(x)%10
		x /= 10
	}

	if (result > 0 && result-intMaxValue > 0) || (result < 0 && result-intMinValue < 0) {
		return 0
	}

	return int(result)
}
