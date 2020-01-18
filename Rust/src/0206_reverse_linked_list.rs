//! Reverse a singly linked list.
//!
//! Example:
//!
//! Input: 1->2->3->4->5->NULL
//! Output: 5->4->3->2->1->NULL
//!
//! Follow up:
//!
//! A linked list can be reversed either iteratively or recursively. Could you implement both?
//!
// Definition for singly-linked list.
use std::option::Option::Some;

#[derive(PartialEq, Eq, Clone, Debug)]
pub struct ListNode {
    pub val: i32,
    pub next: Option<Box<ListNode>>,
}

impl ListNode {
    #[inline]
    fn new(val: i32) -> Self {
        ListNode {
            next: None,
            val,
        }
    }
}

struct Solution {}

impl Solution {
    // iterative solution.
    pub fn reverse_list(head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        let mut input = head;
        let mut pre: Option<Box<ListNode>> = None;

        while let Some(node) = input {
            pre = Some(Box::new(ListNode {
                val: node.val,
                next: pre,
            }));

            input = node.next;
        }

        pre
    }
}

#[cfg(test)]
mod tests {
    use super::ListNode;
    use super::Solution;

    #[test]
    fn test_0() {
        let input5 = ListNode::new(5);
        let mut input4 = ListNode::new(4);
        input4.next = Some(Box::new(input5));
        let mut input3 = ListNode::new(3);
        input3.next = Some(Box::new(input4));
        let mut input2 = ListNode::new(2);
        input2.next = Some(Box::new(input3));
        let mut input1 = ListNode::new(1);
        input1.next = Some(Box::new(input2));

        let input = Some(Box::new(input1));

        let output1 = ListNode::new(1);
        let mut output2 = ListNode::new(2);
        output2.next = Some(Box::new(output1));
        let mut output3 = ListNode::new(3);
        output3.next = Some(Box::new(output2));
        let mut output4 = ListNode::new(4);
        output4.next = Some(Box::new(output3));
        let mut output5 = ListNode::new(5);
        output5.next = Some(Box::new(output4));

        let output = Some(Box::new(output5));

        assert_eq!(Solution::reverse_list(input), output);
    }
}
