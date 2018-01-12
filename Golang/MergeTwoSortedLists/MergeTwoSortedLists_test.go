package MergeTwoSortedLists

import (
	"testing"
	"reflect"
)

func TestMergeTwoLists(t *testing.T) {

	node124 := &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 4,
			},
		},
	}
	node134 := &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 3,
			Next: &ListNode{
				Val: 4,
			},
		},
	}

	if reflect.DeepEqual(mergeTwoLists(node124, node134), &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
				Next: &ListNode{
					Val: 3,
					Next: &ListNode{
						Val: 4,
						Next: &ListNode{
							Val: 4,
						},
					},
				},
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(mergeTwoLists(node124, nil), node124) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(mergeTwoLists(nil, node134), node134) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if mergeTwoLists(nil, nil) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
