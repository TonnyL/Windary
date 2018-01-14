package UniqueBinarySearchTreesII

import (
	"testing"
	"reflect"
)

func TestGenerateTrees(t *testing.T) {

	if reflect.DeepEqual(generateTrees(0), []*TreeNode{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generateTrees(1), []*TreeNode{
		{Val: 1,},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generateTrees(2), []*TreeNode{
		{Val: 1, Right: &TreeNode{Val: 2},},
		{Val: 2, Left: &TreeNode{Val: 1,}},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generateTrees(3), []*TreeNode{
		{
			Val: 1,
			Right: &TreeNode{
				Val: 2,
				Right: &TreeNode{
					Val: 3,
				},
			},
		},
		{
			Val: 1,
			Right: &TreeNode{
				Val: 3,
				Left: &TreeNode{
					Val: 2,
				}},
		},
		{
			Val: 2,
			Left: &TreeNode{
				Val: 1,
			},
			Right: &TreeNode{
				Val: 3,
			},
		},
		{
			Val: 3,
			Left: &TreeNode{
				Val: 1,
				Right: &TreeNode{
					Val: 2,
				},
			},
		},
		{
			Val: 3,
			Left: &TreeNode{
				Val: 2,
				Left: &TreeNode{
					Val: 1,
				},
			}},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
