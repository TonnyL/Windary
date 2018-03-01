package InsertionSortList

//Sort a linked list using insertion sort.
//
//Accepted.

type ListNode struct {
	Val  int
	Next *ListNode
}

func insertionSortList(head *ListNode) *ListNode {
	fakeHead := &ListNode{Val: 0,}

	for ; head != nil; {
		pre := fakeHead

		for ; pre.Next != nil && pre.Next.Val <= head.Val; {
			pre = pre.Next
		}

		headNext := head.Next
		head.Next = pre.Next

		pre.Next = head
		head = headNext
	}

	return fakeHead.Next
}
