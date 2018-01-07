package ReverseLinkedListII

import (
	"testing"
	"reflect"
)

func TestReverseBetween(t *testing.T) {

	if reverseBetween(nil, 1, 2) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(reverseBetween(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 3,
			},
		},
	}, 2, 3), &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 3,
			Next: &ListNode{
				Val: 2,
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(reverseBetween(&ListNode{
		Val: 1,
	}, 1, 1), &ListNode{
		Val: 1,
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(reverseBetween(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
		},
	}, 1, 2), &ListNode{
		Val: 2,
		Next: &ListNode{
			Val: 1,
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(reverseBetween(&ListNode{
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
	}, 2, 4), &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 4,
			Next: &ListNode{
				Val: 3,
				Next: &ListNode{
					Val: 2,
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
