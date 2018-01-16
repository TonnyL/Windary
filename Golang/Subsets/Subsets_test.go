package Subsets

import (
	"testing"
	"reflect"
)

func TestSubsets(t *testing.T) {

	if reflect.DeepEqual(subsets([]int{}),
		[][]int{{}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsets(nil),
		[][]int{{}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsets([]int{1,}),
		[][]int{{}, {1,}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsets([]int{1, 2,}),
		[][]int{{}, {1,}, {2,}, {1, 2,}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsets([]int{1, 2, 3,}),
		[][]int{{}, {1,}, {2,}, {1, 2}, {3,}, {1, 3}, {2, 3,}, {1, 2, 3,}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
