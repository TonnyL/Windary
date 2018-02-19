package BinaryTreeLevelOrderTraversalII

//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//3
/// \
//9  20
///  \
//15   7
//return its bottom-up level order traversal as:
//[
//[15,7],
//[9,20],
//[3]
//]
//
//Accepted.

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func levelOrderBottom(root *TreeNode) [][]int {
	lists := make([][]int, 0)
	helper(&lists, root, 0)
	for i, j := 0, len(lists)-1; i < j; i, j = i+1, j-1 {
		lists[i], lists[j] = lists[j], lists[i]
	}
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
