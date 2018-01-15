package TwoSum

import (
	"testing"
	"reflect"
)

func TestTwoSum(t *testing.T) {

	if reflect.DeepEqual(twoSum([]int{2, 5, 5, 11}, 10), []int{1, 2}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
