package ClimbingStairs

//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Note: Given n will be a positive integer.

func climbStairs(n int) int {
	if n <= 0 {
		return 0
	}
	if n == 1 {
		return 1
	}
	if n == 2 {
		return 2
	}

	results := make([]int, 0)
	results = append(results, 1)
	results = append(results, 2)

	for i := 2; i < n; i++ {
		results = append(results, results[i-1]+results[i-2])
	}

	return results[n-1]
}

//Recursive solution. Time Limit Exceeded.
//func climbStairs(n int) int {
//	if n <= 0 {
//		return 0
//	}
//	if n == 1 {
//		return 1
//	}
//	if n == 2 {
//		return 2
//	}
//
//	return climbStairs(n-1) + climbStairs(n-2)
//}
