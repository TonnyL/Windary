package ValidateBinarySearchTree

//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
//Example 1:
// 2
/// \
//1   3
//Binary tree [2,1,3], return true.
//Example 2:
// 1
/// \
//2   3
//Binary tree [1,2,3], return false.
//
//Accepted.

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func isValidBST(root *TreeNode) bool {
	if root == nil {
		return true
	}

	stack := make([]*TreeNode, 0)
	var pre *TreeNode = nil

	for ; root != nil || len(stack) != 0; {
		for ; root != nil; {
			stack = append(stack, root)
			root = root.Left
		}
		root = stack[len(stack)-1]
		stack = RemoveIndex(stack, len(stack)-1)
		if pre != nil && root.Val <= pre.Val {
			return false
		}
		pre = root
		root = root.Right
	}

	return true

}

func RemoveIndex(s []*TreeNode, index int) []*TreeNode {
	return append(s[:index], s[index+1:]...)
}
