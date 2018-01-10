package DivideTwoIntegers

import "testing"

func TestDivide(t *testing.T) {

	if divide(1, 1) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if divide(0, 1) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if divide(-1, -1) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if divide(intMaxValue, 1) == intMaxValue {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if divide(intMaxValue, intMinValue) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if divide(intMinValue, -1) == intMaxValue {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if divide(100, 6) == 16 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
