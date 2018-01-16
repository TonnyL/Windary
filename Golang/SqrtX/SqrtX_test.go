package SqrtX

import "testing"

func TestMySqrt(t *testing.T) {

	if mySqrt(0) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if mySqrt(1) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if mySqrt(2147395599) == 46339 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if mySqrt(2147395600) == 46340 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if mySqrt(6) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
