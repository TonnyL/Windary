package Permutations

import (
	"testing"
	"reflect"
)

func TestPermute(t *testing.T) {

	if reflect.DeepEqual(permute([]int{}), [][]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(permute([]int{1}), [][]int{{1},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(permute([]int{1, 2,}), [][]int{{2, 1,}, {1, 2,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if len(permute([]int{1, 2, 3,})) == 6 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
