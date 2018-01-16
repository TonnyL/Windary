package RemoveDuplicatesFromSortedArrayII

import "testing"

func TestRemoveDuplicates(t *testing.T) {

	if removeDuplicates([]int{1, 1, 1, 2, 2, 3}) == 5 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeDuplicates([]int{1, 1, 2, 2, 3}) == 5 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeDuplicates(nil) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeDuplicates([]int{1, 1}) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeDuplicates([]int{1, 1, 1, 1}) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
