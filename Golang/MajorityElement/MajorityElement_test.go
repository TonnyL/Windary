package MajorityElement

import "testing"

func TestMajorityElement(t *testing.T) {

	if majorityElement([]int{1, 1, 2}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if majorityElement([]int{0, 1, 1, 1, 2, 3, 1}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if majorityElement([]int{1, 1}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
