package AddTwoNumbers

import (
	"testing"
	"reflect"
)

func TestAddTwoNumbers(t *testing.T) {

	if reflect.DeepEqual(addTwoNumbers(
		&ListNode{
			Val: 0,
		}, &ListNode{
			Val: 0,
		}),
		&ListNode{
			Val: 0,
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(addTwoNumbers(
		&ListNode{
			Val: 5,
		}, &ListNode{
			Val: 5,
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

	if reflect.DeepEqual(addTwoNumbers(
		&ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 4,
				Next: &ListNode{
					Val: 3,
				},
			},
		}, &ListNode{
			Val: 5,
			Next: &ListNode{
				Val: 6,
				Next: &ListNode{
					Val: 4,
				},
			},
		}),
		&ListNode{
			Val: 7,
			Next: &ListNode{
				Val: 0,
				Next: &ListNode{
					Val: 8,
				},
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(addTwoNumbers(
		&ListNode{
			Val: 1,
		}, &ListNode{
			Val: 9,
			Next: &ListNode{
				Val: 9,
			},
		}),
		&ListNode{
			Val: 0,
			Next: &ListNode{
				Val: 0,
				Next: &ListNode{
					Val: 1,
				},
			},
		}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
