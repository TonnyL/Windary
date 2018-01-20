package FourSum

import (
	"testing"
)

func TestFourSum(t *testing.T) {

	if len(fourSum([]int{1, 0, -1, 0, -2, 2,}, 0)) == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if len(fourSum([]int{-5, 5, 4, -3, 0, 0, 4, -2,}, 4)) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
