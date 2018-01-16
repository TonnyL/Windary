package GenerateParentheses

import (
	"testing"
	"reflect"
)

func TestGenerateParenthesis(t *testing.T) {

	if reflect.DeepEqual(generateParenthesis(0),
		[]string{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generateParenthesis(1),
		[]string{"()"}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(generateParenthesis(2),
		[]string{"(())", "()()",}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if len(generateParenthesis(3)) == 5 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if len(generateParenthesis(4)) == 14 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
