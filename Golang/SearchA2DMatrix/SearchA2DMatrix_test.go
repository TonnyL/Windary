package SearchA2DMatrix

import "testing"

func TestSearchMatrix(t *testing.T) {

	if searchMatrix([][]int{}, 0) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if searchMatrix([][]int{{}}, 1) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if searchMatrix([][]int{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if searchMatrix([][]int{{1}}, 1) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
