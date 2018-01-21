package CombinationSumII

import (
	"testing"
	"reflect"
)

func TestCombinationSum2(t *testing.T) {

	if len(combinationSum2([]int{10, 1, 2, 7, 6, 1, 5}, 8)) == 4 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(combinationSum2([]int{}, 2),
		[][]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(combinationSum2([]int{1, 1, 2, 2}, 4),
		[][]int{{1, 1, 2,}, {2, 2},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
