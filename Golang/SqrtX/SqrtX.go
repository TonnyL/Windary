package SqrtX

//Implement int sqrt(int x).
//Compute and return the square root of x.
//
//Accepted.

//import "math"

func mySqrt(x int) int {
	// A tricky way to solve the problem.
	//return int(math.Sqrt(float64(x)))

	if x <= 0 {
		return 0
	}
	if x <= 3 {
		return 1
	}

	high, low := x/2, 1
	// To avoid overflow.
	if x >= 46340*46340 {
		return 46340
	}
	if high > 46340 {
		high = 46340
	}

	mid := (high + 1) / 2
	for ok := true; ok; ok = high > low {
		if mid*mid > x {
			high = mid - 1
		} else if mid*mid < x {
			if (mid+1)*(mid+1) > x {
				return mid
			}
			low = mid + 1
		} else {
			return mid
		}
		mid = (low + high) / 2
	}

	return mid
}
