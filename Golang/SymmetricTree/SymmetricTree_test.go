package SymmetricTree

import "testing"

func TestIsSymmetric(t *testing.T) {

	if isSymmetric(nil) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isSymmetric(&TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val: 2,
			Left: &TreeNode{
				Val: 3,
			},
			Right: &TreeNode{
				Val: 4,
			},
		},
		Right: &TreeNode{
			Val: 2,
			Left: &TreeNode{
				Val: 4,
			},
			Right: &TreeNode{
				Val: 3,
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isSymmetric(&TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val: 2,
			Right: &TreeNode{
				Val: 3,
			},
		},
		Right: &TreeNode{
			Val: 2,
			Right: &TreeNode{
				Val: 3,
			},
		},
	}) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
