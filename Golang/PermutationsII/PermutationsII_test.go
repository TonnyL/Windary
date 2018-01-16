package PermutationsII

import (
	"testing"
	"reflect"
)

func TestPermuteUnique(t *testing.T) {

	if reflect.DeepEqual(permuteUnique([]int{}),
		[][]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(permuteUnique([]int{1,}),
		[][]int{{1},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if len(permuteUnique([]int{1, 1, 2,})) == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
