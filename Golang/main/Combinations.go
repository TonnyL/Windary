package main

// Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
// For example,
// If n = 4 and k = 2, a solution is:
//
// [
// [2,4],
// [3,4],
// [2,3],
// [1,2],
// [1,3],
// [1,4],
// ]

// Iterative solution.
// Accepted.
//func combine(n int, k int) [][]int {
//	if n == 0 || k == 0 || k > n {
//		return [][]int{}
//	}
//
//	var results [][]int = nil
//	for i := 1; i <= n+1-k; i++ {
//		results = append(results, []int{i})
//	}
//
//	for i := 2; i <= k; i++ {
//		var tmp [][]int = nil
//		for _, list := range results {
//			for m := list[len(list)-1] + 1; m <= n-(k-i); m++ {
//				var newList []int = nil
//				for _, value := range list {
//					newList = append(newList, value)
//				}
//				newList = append(newList, m)
//				tmp = append(tmp, newList)
//			}
//		}
//		results = tmp
//	}
//
//	return results
//}

// Recursive solution.
// Accepted.
func combine(n int, k int) [][]int {
	if n == 0 || k == 0 || k > n {
		return [][]int{}
	}

	var results [][]int
	if k == 1 {
		for i := 1; i <= n; i++ {
			results = append(results, []int{i})
		}
		return results
	}

	for _, list := range combine(n, k-1) {
		for i := list[len(list)-1]; i < n; i++ {
			var tmp []int = nil
			for _, value := range list {
				tmp = append(tmp, value)
			}
			tmp = append(tmp, i+1)
			results = append(results, tmp)
		}
	}

	return results
}
