package RotateImage

import (
	"testing"
	"reflect"
)

func TestRotate(t *testing.T) {

	ints1 := [][]int{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
	rotate(ints1)
	if reflect.DeepEqual(ints1, [][]int{{7, 4, 1,}, {8, 5, 2,}, {9, 6, 3,}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints2 := [][]int{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}}
	rotate(ints2)
	if reflect.DeepEqual(ints2, [][]int{{15, 13, 2, 5,}, {14, 3, 4, 1,}, {12, 6, 8, 9,}, {16, 7, 10, 11,}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
