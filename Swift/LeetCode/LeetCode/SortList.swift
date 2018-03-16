//
//  SortList.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 16/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Sort a linked list in O(n log n) time using constant space complexity.
//
//  Accepted. See [SortListTests](./LeetCodeTests/SortListTests.swift) for test cases.
//

import Foundation

class SortList {
    
    func sortList(_ head: ListNode?) -> ListNode? {
        if head == nil || head?.next == nil {
            return head
        }
        
        var slow = head
        var fast = head
        var pre = head
        
        while fast != nil && fast?.next != nil {
            pre = slow
            slow = slow?.next
            fast = fast?.next?.next
        }
        pre?.next = nil
        return self.merge(sortList(head), sortList(slow))
    }
    
//    Runtime error.
//    func merge(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
//        if l1 == nil {
//            return l2
//        }
//        if l2 == nil {
//            return l1
//        }
//        if l1!.val < l2!.val {
//            l1!.next = self.merge(l1?.next, l2)
//            return l1
//        }
//        l2?.next = self.merge(l1, l2?.next)
//        return l2
//    }
    
    func merge(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        let dummy = ListNode(-1)
        var cur: ListNode? = dummy
        var node1 = l1
        var node2 = l2
        while node1 != nil && node2 != nil {
            if node1!.val < node2!.val {
                cur?.next = node1
                node1 = node1?.next
            } else {
                cur?.next = node2
                node2 = node2?.next
            }
            cur = cur?.next
        }
        if node1 != nil {
            cur?.next = node1
        }
        if (node2 != nil) {
            cur?.next = node2
        }
        return dummy.next
    }
    
    public class ListNode: Equatable {
        
        public var val: Int
        public var next: ListNode?
        
        public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
        public static func ==(lhs: SortList.ListNode, rhs: SortList.ListNode) -> Bool {
            return lhs.val == rhs.val && lhs.next == rhs.next
        }
        
    }
    
}
