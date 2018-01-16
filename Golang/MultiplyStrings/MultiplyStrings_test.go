package MultiplyStrings

import "testing"

func TestMultiply(t *testing.T) {

	if multiply("", "") == "0" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if multiply("0", "0") == "0" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if multiply("100", "1") == "100" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if multiply("123", "45") == "5535" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if multiply("99", "99") == "9801" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if multiply("123", "123") == "15129" {

	}

	if multiply("123456789", "123456789") == "15241578750190521" {

	}

}
