package BinaryTreeInorderTraversal

import (
	"testing"
	"reflect"
)

func TestInorderTraversal(t *testing.T) {

	if reflect.DeepEqual(inorderTraversal(
		nil),
		[]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(inorderTraversal(
		&TreeNode{
			Val: 1,
			Right: &TreeNode{
				Val: 2,
				Left: &TreeNode{
					Val: 3,
				},
			},
		}),
		[]int{1, 3, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(inorderTraversal(
		&TreeNode{
			Val: 1,
			Left: &TreeNode{
				Val: 2,
				Left: &TreeNode{
					Val: 4,
				},
				Right: &TreeNode{
					Val: 5,
				},
			},
			Right: &TreeNode{
				Val: 3,
				Left: &TreeNode{
					Val: 6,
				},
				Right: &TreeNode{
					Val: 7,
				},
			},
		}),
		[]int{4, 2, 5, 1, 6, 3, 7}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
