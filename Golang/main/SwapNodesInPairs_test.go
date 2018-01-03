package main

import (
	"testing"
	"reflect"
)

func TestSwapPairs(t *testing.T) {
	// Expected: nil
	if swapPairs(nil) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// Expected: 1

	if reflect.DeepEqual(swapPairs(&ListNode{
		Val: 1,
	}), &ListNode{
		Val: 1,
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// Expected: 2 -> 1
	if reflect.DeepEqual(swapPairs(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
		},
	}), &ListNode{
		Val: 2,
		Next: &ListNode{
			Val: 1,
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// Expected: 2 -> 1 -> 4 -> 3
	if reflect.DeepEqual(swapPairs(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 3,
				Next: &ListNode{
					Val: 4,
				},
			},
		},
	}), &ListNode{
		Val: 2,
		Next: &ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 4,
				Next: &ListNode{
					Val: 3,
				},
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// Expected: 2 -> 1 -> 4 -> 3 -> 5
	if reflect.DeepEqual(swapPairs(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 3,
				Next: &ListNode{
					Val: 4,
					Next: &ListNode{
						Val: 5,
					},
				},
			},
		},
	}), &ListNode{
		Val: 2,
		Next: &ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 4,
				Next: &ListNode{
					Val: 3,
					Next: &ListNode{
						Val: 5,
					},
				},
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
