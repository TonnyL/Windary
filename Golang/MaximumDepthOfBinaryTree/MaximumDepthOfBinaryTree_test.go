package MaximumDepthOfBinaryTree

import "testing"

func TestMaxDepth(t *testing.T) {

	if maxDepth(nil) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if maxDepth(&TreeNode{
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
	}) == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if maxDepth(&TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val: 2,
			Left: &TreeNode{
				Val: 3,
				Left: &TreeNode{
					Val: 4,
				},
			},
		},
	}) == 4 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
