package CombinationSum

import (
	"testing"
	"reflect"
)

func TestCombinationSum(t *testing.T) {

	if reflect.DeepEqual(combinationSum([]int{2, 3, 6, 7,}, 7),
		[][]int{{2, 2, 3,}, {7,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(combinationSum([]int{1,}, 3),
		[][]int{{1, 1, 1,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(combinationSum([]int{1, 2,}, 4),
		[][]int{{1, 1, 1, 1}, {1, 1, 2,}, {2, 2},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
