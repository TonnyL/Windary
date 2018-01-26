//
//  PartitionList.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 07/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//  You should preserve the original relative order of the nodes in each of the two partitions.
//
//  For example,
//  Given 1->4->3->2->5->2 and x = 3,
//  return 1->2->2->4->3->5.
//
//  Accepted. See [PartitionListTests](./LeetCodeTests/PartitionListTests.swift) for test cases.
//

import Foundation

class PartitionList {
    
    func partition(_ head: ListNode?, _ x: Int) -> ListNode? {
        var node = head
        var greater: ListNode? = nil
        var greaterHead: ListNode? = nil
        var less: ListNode? = nil
        var lessHead: ListNode? = nil
        
        while node != nil {
            if node!.val < x {
                if less == nil {
                    less = ListNode(node!.val)
                    lessHead = less
                } else {
                    less?.next = ListNode(node!.val)
                    less = less?.next
                }
            } else {
                if greater == nil {
                    greater = ListNode(node!.val)
                    greaterHead = greater
                } else {
                    greater?.next = ListNode(node!.val)
                    greater = greater?.next
                }
            }
            
            node = node?.next
        }
        
        if greaterHead == nil {
            return lessHead
        } else if lessHead == nil {
            return greaterHead
        }
        
        less?.next = greaterHead
        return lessHead
    }
    
    public class ListNode: Equatable {
        
        public var val: Int
        public var next: ListNode?
        
        public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
        public static func ==(lhs: PartitionList.ListNode, rhs: PartitionList.ListNode) -> Bool {
            return lhs.val == rhs.val && lhs.next == rhs.next
        }
        
    }
    
}
