package LinkedListCycle

//Given a linked list, determine if it has a cycle in it.
//
//Follow up:
//Can you solve it without using extra space?
//
//Waiting to be judged.

type ListNode struct {
	Val  int
	Next *ListNode
}

func hasCycle(head *ListNode) bool {
	if head == nil || head.Next == nil {
		return false
	}
	node := head.Next
	for ; node != head;  {
		if node == nil {
			return false
		}
		node = node.Next
	}
	return true
}

/*func hasCycle(head *ListNode) bool {
	slow, fast := head, head
	for ; fast != nil && fast.Next != nil; {
		slow = slow.Next
		fast = fast.Next.Next
		if slow == fast {
			return true
		}
	}
	return false
}*/
