package IntegerToRoman

//Given an integer, convert it to a roman numeral.
//
//Input is guaranteed to be within the range from 1 to 3999.
//
//Accepted.

func intToRoman(num int) string {
	roman, value := []string{"M", "D", "C", "L", "X", "V", "I",}, []int{1000, 500, 100, 50, 10, 5, 1,}
	result := ""

	for n := 0; n < 7; n += 2 {
		x := num / value[n]
		if x < 4 {
			for i := 1; i <= x; i++ {
				result += roman[n]

			}
		} else if x == 4 {
			result += roman[n]
			result += roman[n-1]
		} else if x < 9 {
			result += roman[n-1]

			for i := 6; i <= x; i++ {
				result += roman[n]

			}
		} else if x == 9 {
			result += roman[n]
			result += roman[n-2]
		}
		num %= value[n]
	}
	return result
}
