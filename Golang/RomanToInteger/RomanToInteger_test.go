package RomanToInteger

import "testing"

func TestRomanToInt(t *testing.T) {

	if romanToInt("DCXXI") == 621 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if romanToInt("MCMXCVI") == 1996 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if romanToInt("CMXCIX") == 999 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
