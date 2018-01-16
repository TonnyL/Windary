package ContainerWithMostWater

import "testing"

func TestMaxArea(t *testing.T) {

	if maxArea([]int{1, 1}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if maxArea([]int{1, 4, 9}) == 4 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if maxArea([]int{1, 4, 9, 4}) == 8 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
