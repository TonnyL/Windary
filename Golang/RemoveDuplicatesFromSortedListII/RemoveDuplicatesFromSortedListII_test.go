package RemoveDuplicatesFromSortedListII

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
				Val: 2,
				Next: &ListNode{
					Val: 3,
					Next: &ListNode{
						Val: 3,
						Next: &ListNode{
							Val: 4,
							Next: &ListNode{
								Val: 4,
								Next: &ListNode{
									Val: 5,
								},
							},
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
					Val: 5,
				},
			}}) {
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
					Next: &ListNode{
						Val: 2,
						Next: &ListNode{
							Val: 3,
						},
					},
				},
			}}),
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

	if deleteDuplicates(
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 1,
				Next: &ListNode{
					Val: 1,
				},
			},
		}) == nil {
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

	if deleteDuplicates(
		&ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 1,
			},
		}) == nil {

	}

	if deleteDuplicates(
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
		}) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
