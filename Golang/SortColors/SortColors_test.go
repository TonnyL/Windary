package SortColors

import (
	"testing"
	"reflect"
)

func TestSortColors(t *testing.T) {

	ints1 := make([]int, 0)
	sortColors(ints1)
	if reflect.DeepEqual(ints1,
		[]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints2 := []int{0}
	sortColors(ints2)
	if reflect.DeepEqual(ints2,
		[]int{0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints3 := []int{2, 1, 0}
	sortColors(ints3)
	if reflect.DeepEqual(ints3,
		[]int{0, 1, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints4 := []int{0, 1, 0, 1, 1, 1, 2, 0, 1}
	sortColors(ints4)
	if reflect.DeepEqual(ints4,
		[]int{0, 0, 0, 1, 1, 1, 1, 1, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints5 := []int{0, 1, 2, 0, 1}
	sortColors(ints5)
	if reflect.DeepEqual(ints5,
		[]int{0, 0, 1, 1, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints6 := []int{2, 2, 2, 2, 1, 0, 2, 0, 1}
	sortColors(ints6)
	if reflect.DeepEqual(ints6,
		[]int{0, 0, 1, 1, 2, 2, 2, 2, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints7 := []int{0, 0, 1, 1, 1, 2, 2, 2}
	sortColors(ints7)
	if reflect.DeepEqual(ints7,
		[]int{0, 0, 1, 1, 1, 2, 2, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints8 := []int{0, 0, 0, 2, 2, 2, 1, 1, 1}
	sortColors(ints8)
	if reflect.DeepEqual(ints8,
		[]int{0, 0, 0, 1, 1, 1, 2, 2, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
