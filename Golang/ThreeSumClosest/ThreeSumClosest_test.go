package ThreeSumClosest

import "testing"

func TestThreeSumClosest(t *testing.T) {

	if threeSumClosest([]int{-1, 2, 1, 4}, 1) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if threeSumClosest([]int{1, 1, 1, 0}, 100) == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if threeSumClosest([]int{1, 1, 1, 0}, -100) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if threeSumClosest([]int{-1, 2, 1, 4}, 1) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
