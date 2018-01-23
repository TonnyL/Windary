package NextPermutation

import (
	"testing"
	"reflect"
)

func TestNextPermutation(t *testing.T) {

	array123 := []int{1, 2, 3}
	nextPermutation(array123)
	if reflect.DeepEqual(array123, []int{1, 3, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	array321 := []int{3, 2, 1}
	nextPermutation(array321)
	if reflect.DeepEqual(array321, []int{1, 2, 3}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	array115 := []int{1, 1, 5}
	nextPermutation(array115)
	if reflect.DeepEqual(array115, []int{1, 5, 1}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
