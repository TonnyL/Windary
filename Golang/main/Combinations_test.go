package main

import (
	"testing"
	"reflect"
)

func TestCombine(t *testing.T) {

	if reflect.DeepEqual(combine(2, 0), [][]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(combine(2, 1), [][]int{{1}, {2}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(combine(4, 2), [][]int{{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(combine(4, 3), [][]int{{1, 2, 3}, {1, 2, 4}, {1, 3, 4}, {2, 3, 4}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
