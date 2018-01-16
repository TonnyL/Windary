package SearchForARange

import (
	"testing"
	"reflect"
)

func TestSearchRange(t *testing.T) {

	if reflect.DeepEqual(searchRange([]int{1}, 1),
		[]int{0, 0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(searchRange([]int{5, 7, 7, 8, 8, 10}, 11),
		[]int{-1, -1}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(searchRange([]int{5, 7, 7, 8, 8, 10}, 8),
		[]int{3, 4}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
