package PartitionList

//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.
//
//For example,
//Given 1->4->3->2->5->2 and x = 3,
//return 1->2->2->4->3->5.
//
//Accepted.

type ListNode struct {
	Val  int
	Next *ListNode
}

func partition(head *ListNode, x int) *ListNode {
	node := head
	var greater *ListNode
	var greaterHead *ListNode
	var less *ListNode
	var lessHead *ListNode

	for ; node != nil; {
		if node.Val < x {
			if less == nil {
				less = &ListNode{
					Val: node.Val,
				}
				lessHead = less
			} else {
				less.Next = &ListNode{
					Val: node.Val,
				}
				less = less.Next
			}
		} else {
			if greater == nil {
				greater = &ListNode{
					Val: node.Val,
				}
				greaterHead = greater
			} else {
				greater.Next = &ListNode{
					Val: node.Val,
				}
				greater = greater.Next
			}
		}

		node = node.Next
	}

	if greaterHead == nil {
		return lessHead
	} else if lessHead == nil {
		return greaterHead
	}

	less.Next = greaterHead
	return lessHead
}
