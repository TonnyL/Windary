package ValidParentheses

import "testing"

func TestIsValid(t *testing.T) {

	if isValid("()") {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValid("()[]{}") {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValid("(") == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValid("(]") == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if isValid("([)]") == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
