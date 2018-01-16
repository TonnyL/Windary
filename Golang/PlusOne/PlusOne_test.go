package PlusOne

import (
	"testing"
	"reflect"
)

func TestPlusOne(t *testing.T) {

	if reflect.DeepEqual(plusOne([]int{1}),
		[]int{2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(plusOne([]int{9}),
		[]int{1, 0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(plusOne([]int{9, 9}),
		[]int{1, 0, 0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(plusOne([]int{2, 8, 9, 9, 9}),
		[]int{2, 9, 0, 0, 0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(plusOne([]int{2, 8, 8, 9}),
		[]int{2, 8, 9, 0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
