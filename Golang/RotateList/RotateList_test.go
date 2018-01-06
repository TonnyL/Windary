package RotateList

import (
	"testing"
	"reflect"
)

func TestRotateRight(t *testing.T) {

	if rotateRight(nil, 1) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// Expected: 1   -->   1
	if reflect.DeepEqual(rotateRight(&ListNode{
		Val: 1,
	}, 1), &ListNode{
		Val: 1,
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// Expected: 1 -> 2   -->   1 -> 2
	if reflect.DeepEqual(rotateRight(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
		},
	}, 0), &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// Expected: 1 -> 2 -> 3   --->   3 -> 1 -> 2
	if reflect.DeepEqual(rotateRight(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 3,
			},
		},
	}, 1), &ListNode{
		Val: 3,
		Next: &ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// Expected: 1 -> 2 -> 3 -> 4 -> 5   -->   4 -> 5 -> 1 -> 2 -> 3
	if reflect.DeepEqual(rotateRight(&ListNode{
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
	}, 2), &ListNode{
		Val: 4,
		Next: &ListNode{
			Val: 5,
			Next: &ListNode{
				Val: 1,
				Next: &ListNode{
					Val: 2,
					Next: &ListNode{
						Val: 3,
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
