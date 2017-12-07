//
//  RemoveNthNodeFromEndOfList.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 07/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a linked list, remove the nth node from the end of list and return its head.
//
//  For example,
//
//  Given linked list: 1->2->3->4->5, and n = 2.
//
//  After removing the second node from the end, the linked list becomes 1->2->3->5.
//  Note:
//  Given n will always be valid.
//  Try to do this in one pass.
//
//  Accepted. See [RemoveNthNodeFromEndOfListTests](./LeetCodeTests/RemoveNthNodeFromEndOfListTests.swift) for test cases.
//

import Foundation

class RemoveNthNodeFromEndOfList {
    
    func removeNthFromEnd(_ head: ListNode?, _ n: Int) -> ListNode? {
        var first = head
        var m = n
        var tmp: ListNode? = nil
        var list = Array<ListNode>.init()
        var node = head
        
        while node != nil {
            list.append(node!)
            node = node?.next
        }
        
        while m > 0 && !list.isEmpty {
            tmp = list[list.count - 1]
            list.remove(at: list.count - 1)
            m -= 1
        }
        
        if tmp != nil {
            if !list.isEmpty {
                list[list.count - 1].next = tmp?.next
            } else {
                first = tmp?.next
            }
        }
        
        return first
    }
    
    public class ListNode: CustomStringConvertible {
        public var val: Int
        public var next: ListNode?
        
        public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
        public var description: String {
            return "ListNode val: \(self.val) next: -> \(String(describing: self.next))"
        }
    }
    
}
