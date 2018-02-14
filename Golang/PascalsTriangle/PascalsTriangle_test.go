package PascalsTriangle

import (
	"testing"
	"reflect"
)

func TestGenerate(t *testing.T) {

	if generate(0) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generate(1), [][]int{{1,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generate(2), [][]int{{1,}, {1, 1,},}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generate(3), [][]int{{1,}, {1, 1,}, {1, 2, 1,}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generate(4), [][]int{{1,}, {1, 1,}, {1, 2, 1,}, {1, 3, 3, 1,}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generate(5), [][]int{{1,}, {1, 1,}, {1, 2, 1,}, {1, 3, 3, 1,}, {1, 4, 6, 4, 1,}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
