package AddBinary

import "testing"

func TestAddBinary(t *testing.T) {

	if addBinary("0", "0") == "0" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if addBinary("11", "1") == "100" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if addBinary("101", "101") == "1010" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
