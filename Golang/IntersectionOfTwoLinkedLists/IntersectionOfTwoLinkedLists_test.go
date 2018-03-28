package IntersectionOfTwoLinkedLists

import (
	"testing"
	"reflect"
)

//Write a program to find the node at which the intersection of two singly linked lists begins.
//
//For example, the following two linked lists:
//
// A:          a1 → a2
//                     ↘
//                     c1 → c2 → c3
//                     ↗
// B:     b1 → b2 → b3
//
//begin to intersect at node c1.
//
//Notes:
//
//If the two linked lists have no intersection at all, return null.
//The linked lists must retain their original structure after the function returns.
//You may assume there are no cycles anywhere in the entire linked structure.
//Your code should preferably run in O(n) time and use only O(1) memory.
//
//Waiting to be judged.

func TestGetIntersectionNode(t *testing.T) {
	if getIntersectionNode(nil, nil) == nil {
		t.Log("pass")
	} else {
		t.Error("pass")
	}

	node345 := &ListNode{
		Val: 3,
		Next: &ListNode{
			Val: 4,
			Next: &ListNode{
				Val: 5,
			},
		},
	}

	if getIntersectionNode(
		node345,
		&ListNode{
			Val: 6,
		}) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(
		getIntersectionNode(&ListNode{
			Val: 1,
			Next: &ListNode{
				Val:  2,
				Next: node345,
			},
		}, node345),
		node345) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
