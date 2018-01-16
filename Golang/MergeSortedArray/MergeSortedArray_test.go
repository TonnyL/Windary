package MergeSortedArray

import (
	"testing"
	"reflect"
)

func TestMerge(t *testing.T) {

	ints1 := []int{1}
	merge(ints1, 1, []int{}, 0);
	if reflect.DeepEqual(ints1,
		[]int{1}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints2 := []int{0}
	merge(ints2, 0, []int{1}, 1)
	if reflect.DeepEqual(ints2,
		[]int{1}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints3 := []int{4, 5, 6, 0, 0, 0}
	merge(ints3, 3, []int{1, 2, 3}, 3)
	if reflect.DeepEqual(ints3,
		[]int{1, 2, 3, 4, 5, 6}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints4 := []int{0, 0, 0, 1, 2, 3, -1, -1, -1}
	merge(ints4, 6, []int{0, 4}, 2)
	if reflect.DeepEqual(ints4,
		[]int{0, 0, 0, 0, 1, 2, 3, 4, -1}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints5 := []int{0, 1, 2, 3, 0, 0, 0, 0, 0}
	merge(ints5, 4, []int{3, 4, 0}, 2)
	if reflect.DeepEqual(ints5,
		[]int{0, 1, 2, 3, 3, 4, 0, 0, 0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints6 := []int{1, 2, 0, 0}
	merge(ints6, 2, []int{1}, 1)
	if reflect.DeepEqual(ints6,
		[]int{1, 1, 2, 0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	ints7 := []int{1, 2, 3, 0, 0, 0}
	merge(ints7, 3, []int{2, 5, 6}, 3)
	if reflect.DeepEqual(ints7,
		[]int{1, 2, 2, 3, 5, 6}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
