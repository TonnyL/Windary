package ReverseInteger

import "testing"

func TestReverse(t *testing.T) {

	if reverse(123) == 321 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reverse(-123) == -321 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reverse(1000000003) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reverse(1534236469) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
