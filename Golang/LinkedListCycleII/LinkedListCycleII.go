package LinkedListCycleII

//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//Note: Do not modify the linked list.
//
//Follow up:
//Can you solve it without using extra space?
//
//Waiting to be judged.

type ListNode struct {
	Val  int
	Next *ListNode
}

func detectCycle(head *ListNode) *ListNode {
	slow, fast := head, head
	for ; fast != nil && fast.Next != nil; {
		slow = slow.Next
		fast = fast.Next.Next
		if slow == fast {
			for ; slow != head; {
				head = head.Next
				slow = slow.Next
			}
			return head
		}
	}
	return nil
}
