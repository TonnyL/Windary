package RemoveDuplicatesFromSortedListII

//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//
//For example,
//Given 1->2->3->3->4->4->5, return 1->2->5.
//Given 1->1->1->2->3, return 2->3.
//
//Accepted.

type ListNode struct {
	Val  int
	Next *ListNode
}

func deleteDuplicates(head *ListNode) *ListNode {
	if head == nil {
		return nil
	}

	fakeHead := &ListNode{
		Val: 0,
	}
	fakeHead.Next = head
	node := fakeHead

	for ; node.Next != nil; {
		tmp := node.Next
		if tmp.Next != nil && tmp.Val == tmp.Next.Val {
			for ; tmp.Next != nil && tmp.Val == tmp.Next.Val; {
				tmp = tmp.Next
			}
			node.Next = tmp.Next
			tmp.Next = nil
		} else {
			node = node.Next
		}
	}
	return fakeHead.Next
}
