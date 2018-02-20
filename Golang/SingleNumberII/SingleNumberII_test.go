package SingleNumberII

import "testing"

func TestSingleNumber(t *testing.T) {

	if singleNumber([]int{1,}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if singleNumber([]int{1, 1, 1,}) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if singleNumber([]int{1, 1, 1, 2,}) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if singleNumber([]int{1, 1, 1, 2, 2, 2, 3,}) == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
