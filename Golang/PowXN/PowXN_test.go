package PowXN

import "testing"

func TestMyPow(t *testing.T) {

	if myPow(2, 2) == 4 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myPow(8.88023, 3) == 700.2814829452681 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myPow(2, -2) == 0.25 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myPow(0.00001, 2147483647) == 0.0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myPow(34.00515, -3) == 2.543114507074558e-05 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
