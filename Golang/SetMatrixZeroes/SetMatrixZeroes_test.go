package SetMatrixZeroes

import (
	"testing"
	"reflect"
)

func TestSetZeroes(t *testing.T) {

	matrix0 := [][]int{{}}
	setZeroes(matrix0)
	if reflect.DeepEqual(matrix0, [][]int{{}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	matrix1 := [][]int{{0, 1}}
	setZeroes(matrix1)
	if reflect.DeepEqual(matrix1, [][]int{{0, 0}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	matrix2 := [][]int{{1, 0, 2}, {3, 4, 5}, {6, 7, 8}}
	setZeroes(matrix2)
	if reflect.DeepEqual(matrix2, [][]int{{0, 0, 0}, {3, 0, 5}, {6, 0, 8}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	matrix3 := [][]int{{0, 1, 1}, {2, 0, 2}, {3, 3, 0}}
	setZeroes(matrix3)
	if reflect.DeepEqual(matrix3, [][]int{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	matrix4 := [][]int{{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}}
	setZeroes(matrix4)
	if reflect.DeepEqual(matrix4, [][]int{{0, 0, 0, 0}, {0, 0, 0, 4}, {0, 0, 0, 0}, {0, 0, 0, 3}, {0, 0, 0, 0}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
