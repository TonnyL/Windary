package PathSum

import "testing"

func TestHasPathSum(t *testing.T) {

	if hasPathSum(nil, 1) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if hasPathSum(&TreeNode{Val: 1,}, 1) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if hasPathSum(
		&TreeNode{
			Val: 5,
			Left: &TreeNode{
				Val: 4,
				Left: &TreeNode{
					Val: 11,
					Left: &TreeNode{
						Val: 7,
					},
					Right: &TreeNode{
						Val: 2,
					},
				},
			},
			Right: &TreeNode{
				Val: 8,
				Left: &TreeNode{
					Val: 13,
				},
				Right: &TreeNode{
					Val: 4,
					Right: &TreeNode{
						Val: 1,
					},
				},
			},
		},
		22) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
