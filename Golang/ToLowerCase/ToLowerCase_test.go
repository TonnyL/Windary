package ToLowerCase

import "testing"

func TestToLowerCase(t *testing.T) {
	if toLowerCase("Hello") == "hello" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if toLowerCase("here") == "here" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if toLowerCase("LOVELY") == "lovely" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}
}
