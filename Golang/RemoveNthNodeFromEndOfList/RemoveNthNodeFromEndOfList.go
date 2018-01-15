package RemoveNthNodeFromEndOfList

//Given a linked list, remove the nth node from the end of list and return its head.
//
//For example,
//
//Given linked list: 1->2->3->4->5, and n = 2.
//
//After removing the second node from the end, the linked list becomes 1->2->3->5.
//Note:
//Given n will always be valid.
//Try to do this in one pass.
//
//Accepted.

type ListNode struct {
	Val  int
	Next *ListNode
}

func removeNthFromEnd(head *ListNode, n int) *ListNode {
	stack := make([]*ListNode, 0)
	var tmp *ListNode
	node := head

	for ; node != nil; node = node.Next {
		stack = append(stack, node)
	}

	for ; n > 0 && len(stack) != 0; n-- {
		tmp = stack[len(stack)-1]
		stack = removeIndex(stack, len(stack)-1)
	}

	if tmp != nil {
		if len(stack) != 0 {
			stack[len(stack)-1].Next = tmp.Next
		} else {
			head = tmp.Next
		}
	}

	return head
}

func removeIndex(s []*ListNode, index int) []*ListNode {
	return append(s[:index], s[index+1:]...)
}
