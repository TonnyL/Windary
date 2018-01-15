package AddTwoNumbers

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Example
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
//
//Accepted.

type ListNode struct {
	Val  int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	tmp1, tmp2 := l1.Next, l2.Next

	results := make([]*ListNode, 0)

	addOne := l1.Val+l2.Val >= 10

	result := &ListNode{
		Val: (l1.Val + l2.Val) % 10,
	}

	if addOne {
		result.Next = &ListNode{
			Val: 1,
		}
	}

	results = append(results, result)

	for ; true; {
		if tmp1 == nil && tmp2 == nil {
			break
		} else {
			tmp := 0
			if tmp1 == nil {
				tmp = tmp2.Val
			} else if tmp2 == nil {
				tmp = tmp1.Val
			} else {
				tmp = tmp1.Val + tmp2.Val
			}

			if addOne {
				tmp++
			}

			addOne = tmp >= 10
			result = &ListNode{
				Val: tmp % 10,
			}

			if addOne {
				result.Next = &ListNode{
					Val: 1,
				}
			}

			results = append(results, result)

			if tmp1 != nil {
				tmp1 = tmp1.Next
			}
			if tmp2 != nil {
				tmp2 = tmp2.Next
			}
		}

	}

	rst := results[0]
	resultLength := len(results)
	for i := 1; i < resultLength; i++ {
		rst.Next = results[i]
		rst = rst.Next
	}

	return results[0]
}
