package StringToIntegerAtoi

import "testing"

func TestMyAtoi(t *testing.T) {

	if myAtoi("+-1") == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myAtoi("-00123a66") == -123 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myAtoi("-1") == -1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myAtoi("    10522545459") == 2147483647 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myAtoi("-2147483647") == -2147483647 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myAtoi("2147483648") == 2147483647 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myAtoi("-2147483649") == -2147483648 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if myAtoi("2147483647") == 2147483647 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
