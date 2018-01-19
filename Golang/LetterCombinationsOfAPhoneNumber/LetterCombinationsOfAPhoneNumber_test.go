package LetterCombinationsOfAPhoneNumber

import (
	"testing"
	"reflect"
)

func TestLetterCombinations(t *testing.T) {

	if reflect.DeepEqual(letterCombinations(""), []string{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(letterCombinations("1"), []string{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(letterCombinations("2"), []string{"a", "b", "c"}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(letterCombinations("23"), []string{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(letterCombinations("234"), []string{"adg", "adh", "adi", "aeg", "aeh", "aei",
		"afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh",
		"bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg",
		"ceh", "cei", "cfg", "cfh", "cfi"}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
