package RotateArray

import (
	"testing"
	"reflect"
)

func TestRotate(t *testing.T) {
	array0 := []int{1}
	rotate(array0, 1)
	if reflect.DeepEqual(array0, []int{1}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	array1 := []int{1, 2}
	rotate(array1, 1)
	if reflect.DeepEqual(array1, []int{2, 1}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	array2 := []int{1, 2, 3, 4, 5, 6, 7}
	rotate(array2, 3)
	if reflect.DeepEqual(array2, []int{5, 6, 7, 1, 2, 3, 4}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
