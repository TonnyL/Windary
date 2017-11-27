//
//  RemoveDuplicatesFromSortedListII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a sorted linked list, delete all nodes that have duplicate numbers,
//  leaving only distinct numbers from the original list.
//  For example,
//  Given 1->2->3->3->4->4->5, return 1->2->5.
//  Given 1->1->1->2->3, return 2->3.
//
//  Accepted. See [RemoveDuplicatesFromSortedListII](./LeetCodeTests/RemoveDuplicatesFromSortedListIITests.swift) for test cases.
//

import Foundation

class RemoveDuplicatesFromSortedListII {
    
    func deleteDuplicates(_ head: ListNode?) -> ListNode? {
        if head == nil {
            return nil
        }
        
        let fakeHead = ListNode(0)
        fakeHead.next = head
        var node: ListNode? = fakeHead
        
        while node?.next != nil {
            var tmp = node?.next
            if tmp?.next != nil && tmp?.val == tmp?.next?.val {
                while tmp?.next != nil && tmp?.val == tmp?.next?.val {
                    tmp = tmp?.next
                }
                node?.next = tmp?.next
                tmp?.next = nil
            } else {
                node = node?.next
            }
        }
        
        return fakeHead.next
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
