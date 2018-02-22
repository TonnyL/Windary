package LinkedListCycle

import "testing"

func TestHasCycle(t *testing.T) {

	if hasCycle(nil) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if hasCycle(&ListNode{
		Val: 0,
	}) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	node0 := &ListNode{
		Val: 0,
		Next: &ListNode{
			Val: 1,
		},
	}
	node0.Next.Next = node0
	if hasCycle(node0) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if hasCycle(&ListNode{
		Val: 0,
		Next: &ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
				Next: &ListNode{
					Val: 0,
				},
			},
		},
	}) == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
