package RotateList

//Given a list, rotate the list to the right by k places, where k is non-negative.
//
//Example:
//
//Given 1->2->3->4->5->NULL and k = 2,
//
//return 4->5->1->2->3->NULL.
//
//Accepted.

type ListNode struct {
	Val  int
	Next *ListNode
}

func rotateRight(head *ListNode, k int) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	node := head
	length := 1
	for ; node.Next != nil; {
		length++

		node = node.Next
	}

	//Form a circle
	node.Next = head
	k %= length

	for i := 0; i < length-k; i++ {
		node = node.Next
	}
	head = node.Next
	node.Next = nil

	return head
}
