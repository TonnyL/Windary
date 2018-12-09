package TransposeMatrix

import (
	"reflect"
	"testing"
)

func TestTransposeMatrix(t *testing.T) {
	if reflect.DeepEqual(transpose([][]int{{1, 1}}), [][]int{{1}, {1}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(transpose([][]int{{1}, {1}}), [][]int{{1, 1}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(transpose([][]int{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), [][]int{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}){
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(transpose([][]int{{1, 2, 3}, {4, 5, 6}}), [][]int{{1, 4}, {2, 5}, {3, 6}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}
}
