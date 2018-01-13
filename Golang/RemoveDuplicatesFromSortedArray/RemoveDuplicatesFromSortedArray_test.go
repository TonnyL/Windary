package RemoveDuplicatesFromSortedArray

import "testing"

func TestRemoveDuplicates(t *testing.T) {

	if removeDuplicates([]int{}) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeDuplicates([]int{1, 2, 2}) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeDuplicates([]int{1, 1, 1}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeDuplicates([]int{1, 1, 2, 3, 4}) == 4 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
