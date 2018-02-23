package PascalsTriangleII

import (
	"testing"
	"reflect"
)

func TestGetRow(t *testing.T) {

	if reflect.DeepEqual(
		getRow(0),
		[]int{1,}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(
		getRow(1),
		[]int{1, 1,}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(
		getRow(2),
		[]int{1, 2, 1,}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(
		getRow(3),
		[]int{1, 3, 3, 1,}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(
		getRow(4),
		[]int{1, 4, 6, 4, 1,}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
