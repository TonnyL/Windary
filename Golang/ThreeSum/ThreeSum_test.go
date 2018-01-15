package ThreeSum

import (
	"testing"
	"reflect"
)

func TestThreeSum(t *testing.T) {

	if reflect.DeepEqual(threeSum([]int{-1, 0}), [][]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(threeSum([]int{-1, 0, 1, 2, -1, -4}),
		[][]int{{-1, -1, 2}, {-1, 0, 1},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(threeSum([]int{0, 0, 0}),
		[][]int{{0, 0, 0}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(threeSum([]int{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6}),
		[][]int{{-4, -2, 6}, {-4, 0, 4}, {-4, 1, 3}, {-4, 2, 2}, {-2, -2, 4}, {-2, 0, 2}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
