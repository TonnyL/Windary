package RemoveDuplicatesFromSortedList

import (
	"testing"
	"reflect"
)

func TestDeleteDuplicates(t *testing.T) {

	if deleteDuplicates(nil) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(deleteDuplicates(
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 1,
				Next: &ListNode{
					Val: 2,
				},
			},
		}),
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(deleteDuplicates(
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 1,
				Next: &ListNode{
					Val: 2,
					Next: &ListNode{
						Val: 3,
						Next: &ListNode{
							Val: 3,
						},
					},
				},
			},
		}),
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
				Next: &ListNode{
					Val: 3,
				},
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(deleteDuplicates(
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 1,
				Next: &ListNode{
					Val: 1,
				},
			},
		}),
		&ListNode{
			Val: 1,
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(deleteDuplicates(
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
				Next: &ListNode{
					Val: 2,
					Next: &ListNode{
						Val: 2,
					},
				},
			},
		}),
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(deleteDuplicates(
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 1,
				Next: &ListNode{
					Val: 2,
					Next: &ListNode{
						Val: 2,
					},
				},
			},
		}),
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
