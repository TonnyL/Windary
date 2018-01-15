package UniqueBinarySearchTrees

//Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
//
//For example,
//Given n = 3, there are a total of 5 unique BST's.
//
//1        3     3      2      1
//\       /     /      / \      \
//3      2     1      1   3      2
///     /      \                 \
//2    1       2                 3
//

//Dynamic programming. Accepted.
func numTrees(n int) int {
	array := make([]int, n+2)
	array[0] = 1
	array[1] = 1

	for i := 2; i <= n; i++ {
		for j := 0; j < i; j++ {
			array[i] += array[j] * array[i-j-1]
		}
	}

	return array[n]
}

//Recursive solution. Time Limit Exceeded.
/*func numTrees(n int) int {
	if n == 0 || n == 1 {
		return 1
	}
	r := 0
	for i := 1; i <= n; i++ {
		r = r + numTrees(i-1)*numTrees(n-i)
	}
	return r
}*/
