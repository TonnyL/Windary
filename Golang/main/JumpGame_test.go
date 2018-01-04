package main

import (
	"testing"
)

func TestCanJump(t *testing.T) {

	if canJump(nil) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if canJump([]int{}) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if canJump([]int{1}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if canJump([]int{0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if canJump([]int{2, 3, 1, 1, 4}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if canJump([]int{3, 2, 1, 0, 4}) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if canJump([]int{4, 0, 0, 0}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
