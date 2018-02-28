package LinkedListCycleII

import "testing"

func TestDetectCycle(t *testing.T) {
	if detectCycle(nil) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if detectCycle(&ListNode{
		Val: 0,
	}) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
