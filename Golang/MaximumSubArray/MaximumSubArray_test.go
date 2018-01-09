package MaximumSubArray

import "testing"

func TestMaxSubArray(t *testing.T) {

	if maxSubArray([]int{1}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if maxSubArray([]int{-4, -2}) == -2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if maxSubArray([]int{1, 0, -1}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if maxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4}) == 6 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
