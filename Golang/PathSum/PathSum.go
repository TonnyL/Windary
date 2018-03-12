package PathSum

//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//For example:
//Given the below binary tree and sum = 22,
//
//5
/// \
//4  8
///  / \
//11 13 4
///  \   \
//7  2   1
//return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
//
//Accepted.

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func hasPathSum(root *TreeNode, sum int) bool {
	return root != nil && (root.Left == nil && root.Right == nil && sum == root.Val || hasPathSum(root.Left, sum-root.Val) || hasPathSum(root.Right, sum-root.Val))
}
