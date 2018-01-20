package IntegerToRoman

import "testing"

func TestIntToRoman(t *testing.T) {

	if intToRoman(1) == "I" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if intToRoman(621) == "DCXXI" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if intToRoman(1996) == "MCMXCVI" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if intToRoman(999) == "CMXCIX" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
