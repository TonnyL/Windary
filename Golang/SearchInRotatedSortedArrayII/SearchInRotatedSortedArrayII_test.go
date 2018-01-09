package SearchInRotatedSortedArrayII

import "testing"

func TestSearch(t *testing.T) {

	if search([]int{3, 2}, 4) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{3, 1, 2}, 4) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{3, 1, 2}, 2) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{2, 2, 2, 2, 3, 4, 1, 1}, 4) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{4, 5, 6, 7, 0, 1, 2}, 2) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{4, 5, 6, 7, 0, 1, 2}, 7) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if search([]int{4, 5, 6, 7, 0, 1, 2}, 5) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
