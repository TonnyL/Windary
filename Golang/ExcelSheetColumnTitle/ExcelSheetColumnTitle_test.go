package ExcelSheetColumnTitle

import "testing"

func TestConvertToTitle(t *testing.T) {

	if convertToTitle(1) == "A" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if convertToTitle(2) == "B" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if convertToTitle(26) == "Z" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if convertToTitle(27) == "AA" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if convertToTitle(28) == "AB" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
