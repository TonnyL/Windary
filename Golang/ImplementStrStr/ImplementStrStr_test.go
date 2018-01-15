package ImplementStrStr

import "testing"

func TestStrStr(t *testing.T) {

	if strStr("aaab", "b") == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if strStr("", "") == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if strStr("", "a") == -1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if strStr("whats up", "s ") == 4 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
