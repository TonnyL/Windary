package DivideTwoIntegers

//Divide two integers without using multiplication, division and mod operator.
//
//If it is overflow, return MAX_INT.
//
//Accepted.

const intMaxValue = 2147483647
const intMinValue = -2147483648

func divide(dividend int, divisor int) int {

	longDividend := int64(dividend)
	if longDividend < 0 {
		longDividend = -longDividend
	}
	longDivisor := int64(divisor)
	if longDivisor < 0 {
		longDivisor = -longDivisor
	}

	result := int64(0)

	for ; longDividend >= longDivisor; {
		tmpDivisor := longDivisor
		i := uint(0)

		for ; tmpDivisor <= longDividend; {
			longDividend -= tmpDivisor
			tmpDivisor = tmpDivisor << 1
			result += 1 << i
			i += 1
		}

	}

	if dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0 {
		result = -result
	}

	if result < intMinValue || result > intMaxValue {
		return intMaxValue
	}

	return int(result)
}
