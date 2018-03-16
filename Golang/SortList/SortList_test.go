package SortList

import (
	"testing"
	"reflect"
)

func TestSortList(t *testing.T) {

	if sortList(nil) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(
		&ListNode{
			Val: 0,
		},
		sortList(&ListNode{
			Val: 0,
		})) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	node1 := &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 0,
		},
	}
	node2 := &ListNode{
		Val: 0,
		Next: &ListNode{
			Val: 1,
		},
	}
	if reflect.DeepEqual(node2, sortList(node1)) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	node3 := &ListNode{
		Val: 0,
		Next: &ListNode{
			Val: 1,
		},
	}
	if reflect.DeepEqual(node3, sortList(node2)) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
