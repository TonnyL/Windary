package SymmetricTree

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//1
/// \
//2   2
/// \ / \
//3  4 4  3
//But the following [1,2,2,null,3,null,3] is not:
//1
/// \
//2   2
//\   \
//3    3
//Note:
//Bonus points if you could solve it both recursively and iteratively.
//
//Accepted.

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func isSymmetric(root *TreeNode) bool {
	return isMirror(root, root)
}

func isMirror(node1, node2 *TreeNode) bool {
	return node1 == nil && node2 == nil || node1 != nil && node2 != nil && (node1.Val == node2.Val) && isMirror(node1.Right, node2.Left) && isMirror(node1.Left, node2.Right)
}
