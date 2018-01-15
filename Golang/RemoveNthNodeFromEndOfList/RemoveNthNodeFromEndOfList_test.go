package RemoveNthNodeFromEndOfList

import (
	"testing"
	"reflect"
)

func TestRemoveNthFromEnd(t *testing.T) {

	if reflect.DeepEqual(removeNthFromEnd(
		&ListNode{
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
			}}, 2),
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
				Next: &ListNode{
					Val: 3,
					Next: &ListNode{
						Val: 5,
					},
				},
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(removeNthFromEnd(
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
			}}, 1),
		&ListNode{
			Val: 1,
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeNthFromEnd(&ListNode{
		Val: 1,
	}, 1) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if removeNthFromEnd(nil, 2) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	node123 := &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 3,
			},
		},
	}
	node123 = removeNthFromEnd(node123, 3)
	if reflect.DeepEqual(node123,
		&ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 3,
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	node123 = removeNthFromEnd(node123, 1)
	if reflect.DeepEqual(node123,
		&ListNode{
			Val: 2,
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	node123 = removeNthFromEnd(node123, 1)
	if node123 == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
