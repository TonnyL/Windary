package SingleNumber

import "testing"

func TestSingleNumber(t *testing.T) {

	if singleNumber(nil) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if singleNumber([]int{1}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if singleNumber([]int{1, 1, 2}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if singleNumber([]int{1, 1, 2, 2, 3}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
