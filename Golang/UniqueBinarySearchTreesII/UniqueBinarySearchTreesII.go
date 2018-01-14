package UniqueBinarySearchTreesII

//Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
//
//For example,
//Given n = 3, your program should return all 5 unique BST's shown below.
//
//1       3     3      2      1
//\      /     /      / \      \
//3     2     1      1  3      2
///    /       \                \
//2   1        2                 3
//
//Accepted.

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func generateTrees(n int) []*TreeNode {
	if n <= 0 {
		return []*TreeNode{}
	}

	return gen(1, n)
}

func gen(start int, end int) []*TreeNode {
	result := make([]*TreeNode, 0)

	if start > end {
		result = append(result, nil)
		return result
	}
	if start == end {
		result = append(result, &TreeNode{Val: start,})
		return result
	}

	for i := start; i <= end; i++ {
		for _, m := range gen(start, i-1) {
			for _, n := range gen(i+1, end) {
				root := &TreeNode{
					Val:   i,
					Left:  m,
					Right: n,
				}
				result = append(result, root)
			}
		}
	}

	return result
}
