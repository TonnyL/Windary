package RemoveDuplicatesFromSortedList

//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//For example,
//Given 1->1->2, return 1->2.
//Given 1->1->2->3->3, return 1->2->3.
//
//Accepted.

type ListNode struct {
	Val  int
	Next *ListNode
}

func deleteDuplicates(head *ListNode) *ListNode {
	node := head
	for ; node != nil && node.Next != nil; {
		if node.Val == node.Next.Val {
			tmp := node.Next
			node.Next = tmp.Next
			tmp.Next = nil
		} else {
			node = node.Next
		}
	}

	return head
}
