package SearchInRotatedSortedArray

import "testing"

func TestSearch(t *testing.T) {

	if search([]int{}, 1) == -1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{0, 1, 2, 4, 5, 6, 7}, 7) == 6 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{4, 5, 6, 7, 0, 1, 2}, 7) == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{5, 6, 7, 0, 1, 2, 4}, 7) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{4, 5, 6, 7, 0, 1, 2}, 8) == -1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
