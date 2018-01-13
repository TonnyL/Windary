package SameTree

import "testing"

func TestIsSameTree(t *testing.T) {

	if isSameTree(nil, nil) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	tn1 := &TreeNode{
		Val: 1,
	}
	if isSameTree(nil, tn1) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}
	if isSameTree(tn1, nil) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	tn2 := &TreeNode{
		Val: 2,
	}
	if isSameTree(tn1, tn2) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isSameTree(&TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val: 1,
		},
		Right: &TreeNode{
			Val: 1,
		},
	}, &TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val: 1,
		},
		Right: &TreeNode{
			Val: 1,
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
