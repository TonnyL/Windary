package SearchInsertPosition

import "testing"

func TestSearchInsert(t *testing.T) {

	if searchInsert([]int{1}, 0) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if searchInsert([]int{1, 3, 5, 6}, 5) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if searchInsert([]int{1, 3, 5, 6}, 2) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if searchInsert([]int{1, 3, 5, 6}, 7) == 4 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if searchInsert([]int{1, 3, 5, 6}, 0) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
