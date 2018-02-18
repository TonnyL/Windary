package BinaryTreeLevelOrderTraversal

import (
	"testing"
	"reflect"
)

func TestLevelOrder(t *testing.T) {

	if len(levelOrder(nil)) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(levelOrder(
		&TreeNode{
			Val: 1,
		}), [][]int{{1,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(levelOrder(
		&TreeNode{
			Val: 3,
			Left: &TreeNode{
				Val: 9,
			},
			Right: &TreeNode{
				Val: 20,
				Left: &TreeNode{
					Val: 15,
				},
				Right: &TreeNode{
					Val: 7,
				},
			},
		}), [][]int{{3,}, {9, 20,}, {15, 7,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
