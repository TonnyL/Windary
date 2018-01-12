package PowXN

//import "math"

//Implement pow(x, n).
//Accepted.

func myPow(x float64, n int) float64 {
	//A tricky way to solve the problem.
	//return math.Pow(x, float64(n))

	if n == 0 {
		return 1
	}
	if n == 1 {
		return x
	}

	result := myPow(x, n/2)
	if n%2 == 0 {
		return result * result
	} else if n > 0 {
		return x * result * result
	}

	return (result * result) / x
}
