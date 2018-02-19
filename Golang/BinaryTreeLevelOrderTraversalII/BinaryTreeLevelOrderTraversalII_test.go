package BinaryTreeLevelOrderTraversalII

import (
	"reflect"
	"testing"
)

func TestLevelOrder(t *testing.T) {

	if len(levelOrderBottom(nil)) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(levelOrderBottom(
		&TreeNode{
			Val: 1,
		}), [][]int{{1,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(levelOrderBottom(
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
		}), [][]int{{15, 7,}, {9, 20,}, {3,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
