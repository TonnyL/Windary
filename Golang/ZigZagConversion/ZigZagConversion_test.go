package ZigZagConversion

import "testing"

func TestConvert(t *testing.T) {

	if convert("0123456789", 1) == "0123456789" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if convert("PAYPALISHIRING", 3) == "PAHNAPLSIIGYIR" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if convert("0123456789", 2) == "0246813579" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if convert("0123456789", 3) == "0481357926" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
