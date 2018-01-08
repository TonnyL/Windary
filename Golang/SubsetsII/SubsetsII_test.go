package SubsetsII

import (
	"testing"
	"reflect"
)

func TestSubsetsWithDup(t *testing.T) {

	if reflect.DeepEqual(subsetsWithDup([]int{}), [][]int{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsetsWithDup([]int{1}), [][]int{{}, {1}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsetsWithDup([]int{1, 1}), [][]int{{1}, {}, {1, 1}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsetsWithDup([]int{1, 2}), [][]int{{2}, {}, {2, 1}, {1}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsetsWithDup([]int{1, 2, 2}), [][]int{{2, 2}, {2}, {}, {2, 2, 1}, {2, 1}, {1}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(subsetsWithDup([]int{4, 4, 4, 1, 4}), [][]int{{4, 4, 4, 4}, {4, 4, 4}, {4, 4}, {4}, {}, {4, 4, 4, 4, 1}, {4, 4, 4, 1}, {4, 4, 1}, {4, 1}, {1}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
