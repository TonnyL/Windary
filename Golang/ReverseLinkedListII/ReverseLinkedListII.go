package ReverseLinkedListII

//Reverse a linked list from position m to n. Do it in-place and in one-pass.
//
//For example:
//Given 1->2->3->4->5->NULL, m = 2 and n = 4,
//
//return 1->4->3->2->5->NULL.
//
//Note:
//Given m, n satisfy the following condition:
//1 ≤ m ≤ n ≤ length of list.
//
//Accepted.

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseBetween(head *ListNode, m int, n int) *ListNode {
	node := head
	var list []*ListNode

	for i := 0; i <= n-1 && node != nil; i++ {
		if m-1 <= i {
			list = append(list, node)
		}
		node = node.Next
	}

	for ; len(list) >= 2; {
		tmp := list[0].Val
		list[0].Val = list[len(list)-1].Val
		list[len(list)-1].Val = tmp

		list = RemoveIndex(list, 0)
		list = RemoveIndex(list, len(list)-1)
	}

	return head
}

func RemoveIndex(s []*ListNode, index int) []*ListNode {
	return append(s[:index], s[index+1:]...)
}
