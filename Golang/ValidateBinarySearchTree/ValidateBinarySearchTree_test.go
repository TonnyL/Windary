package ValidateBinarySearchTree

import "testing"

func TestIsValidBST(t *testing.T) {

	if isValidBST(nil) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValidBST(&TreeNode{
		Val: 2,
		Left: &TreeNode{
			Val: 1,
		},
		Right: &TreeNode{
			Val: 3,
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValidBST(&TreeNode{
		Val: 1,
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValidBST(&TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val: 2,
		},
		Right: &TreeNode{
			Val: 3,
		},
	}) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValidBST(&TreeNode{
		Val: 3,
		Left: &TreeNode{
			Val: 2,
			Left: &TreeNode{
				Val: 1,
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValidBST(&TreeNode{
		Val: 1,
		Right: &TreeNode{
			Val: 0,
		},
	}) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValidBST(&TreeNode{
		Val: 0,
		Left: &TreeNode{
			Val: -1,
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
