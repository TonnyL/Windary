package SpiralMatrixII

import (
	"testing"
	"reflect"
)

func TestGenerateMatrix(t *testing.T) {

	if reflect.DeepEqual(generateMatrix(0),
		[][]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generateMatrix(1),
		[][]int{{1}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generateMatrix(2),
		[][]int{{1, 2}, {4, 3}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generateMatrix(4),
		[][]int{{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
