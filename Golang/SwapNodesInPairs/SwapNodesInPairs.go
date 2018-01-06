package SwapNodesInPairs

// Given a linked list, swap every two adjacent nodes and return its head.
//
// For example,
// Given 1->2->3->4, you should return the list as 2->1->4->3.
//
// Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
//
// Accepted.
//

type ListNode struct {
	Val  int
	Next *ListNode
}

func swapPairs(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	for pre, nxt := head, head.Next; pre != nil && nxt != nil; {
		tmp := nxt.Val
		nxt.Val = pre.Val
		pre.Val = tmp

		pre = nxt.Next
		if pre != nil {
			nxt = pre.Next
		}
	}

	return head
}
