package BinaryTreeInorderTraversal

//Given a binary tree, return the inorder traversal of its nodes' values.
//
//For example:
//Given binary tree [1,null,2,3],
//1
//\
//2
///
//3
//return [1,3,2].
//
//Note: Recursive solution is trivial, could you do it iteratively?

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

//Accepted.
func inorderTraversal(root *TreeNode) []int {
	list := make([]int, 0)
	if root == nil {
		return list
	}

	stack := make([]*TreeNode, 0)
	for ; root != nil || len(stack) != 0; {
		for ; root != nil; {
			stack = append(stack, root)
			root = root.Left
		}

		root = stack[len(stack)-1]
		list = append(list, root.Val)
		stack = removeIndex(stack, len(stack)-1)
		root = root.Right
	}

	return list
}

func removeIndex(s []*TreeNode, index int) []*TreeNode {
	return append(s[:index], s[index+1:]...)
}

//Recursive solution.
//Accepted.
//func inorderTraversal(root *TreeNode) []int {
//	list := make([]int, 0)
//
//	if root == nil {
//		return list
//	}
//	if root.Left != nil {
//		for _, i := range inorderTraversal(root.Left) {
//			list = append(list, i)
//		}
//	}
//
//	list = append(list, root.Val)
//
//	if root.Right != nil {
//		for _, i := range inorderTraversal(root.Right) {
//			list = append(list, i)
//		}
//	}
//	return list
//}
