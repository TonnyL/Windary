package BinaryTreeLevelOrderTraversal

//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//3
/// \
//9  20
///  \
//15   7
//return its level order traversal as:
//[
//[3],
//[9,20],
//[15,7]
//]
//
//Accepted.

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func levelOrder(root *TreeNode) [][]int {
	lists := make([][]int, 0)
	helper(&lists, root, 0)
	return lists
}

func helper(lists *[][]int, root *TreeNode, height int) {
	if root == nil {
		return
	}
	if height >= len(*lists) {
		*lists = append(*lists, make([]int, 0))
	}

	(*lists)[height] = append((*lists)[height], root.Val)
	helper(lists, root.Left, height+1)
	helper(lists, root.Right, height+1)
}
