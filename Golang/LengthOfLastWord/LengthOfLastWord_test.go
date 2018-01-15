package LengthOfLastWord

import "testing"

func TestLengthOfLastWord(t *testing.T) {

	if lengthOfLastWord("Hello World") == 5 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if lengthOfLastWord(" ") == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if lengthOfLastWord("a") == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if lengthOfLastWord("a ") == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
