package SpiralMatrix

import (
	"testing"
	"reflect"
)

func TestSpiralOrder(t *testing.T) {

	if reflect.DeepEqual(spiralOrder([][]int{{}}),
		[]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(spiralOrder([][]int{{1}, {2}, {3}}),
		[]int{1, 2, 3}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(spiralOrder([][]int{{1, 2, 3}}),
		[]int{1, 2, 3}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(spiralOrder([][]int{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}}),
		[]int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(spiralOrder([][]int{{1, 2}, {3, 4}}),
		[]int{1, 2, 4, 3}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(spiralOrder([][]int{{1, 2}, {3, 4}, {5, 6}}),
		[]int{1, 2, 4, 6, 5, 3}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(spiralOrder([][]int{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
		[]int{1, 2, 3, 6, 9, 8, 7, 4, 5}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(spiralOrder([][]int{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}),
		[]int{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}
}
