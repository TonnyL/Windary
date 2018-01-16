package CountAndSay

import "testing"

func TestCountAndSay(t *testing.T) {

	if countAndSay(1) == "1" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if countAndSay(2) == "11" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if countAndSay(3) == "21" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if countAndSay(4) == "1211" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if countAndSay(5) == "111221" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if countAndSay(6) == "312211" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
