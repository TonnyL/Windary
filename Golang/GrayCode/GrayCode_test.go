package GrayCode

import (
	"testing"
	"reflect"
)

func TestGrayCode(t *testing.T) {

	if reflect.DeepEqual(grayCode(0), []int{0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(grayCode(2), []int{0, 1, 3, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(grayCode(3), []int{0, 1, 3, 2, 6, 7, 5, 4}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
