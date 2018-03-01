package InsertionSortList

import (
	"testing"
	"reflect"
)

func TestInsertionSortList(t *testing.T) {

	if insertionSortList(nil) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(
		insertionSortList(&ListNode{
			Val: 1,
		}),
		&ListNode{
			Val: 1,
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(
		insertionSortList(&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 0,
			},
		}),
		&ListNode{
			Val: 0,
			Next: &ListNode{
				Val: 1,
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
