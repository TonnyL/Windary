package MinimumPathSum

import "testing"

func TestMinPathSum(t *testing.T) {

	if minPathSum([][]int{}) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if minPathSum([][]int{{}}) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if minPathSum([][]int{{1}}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// The matrix:
	// 1 4 5
	// 2 7 6
	// 6 8 7
	if minPathSum([][]int{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}) == 7 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// The matrix:
	// 1 2 3
	// 2 4 4
	// 3 6 5
	if minPathSum([][]int{{1, 1, 1}, {1, 2, 1}, {1, 3, 1}}) == 5 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
