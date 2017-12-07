//
//  MergeTwoSortedLists.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 07/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//

import Foundation

class MergeTwoSortedLists {
    
    func mergeTwoLists(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        var node1 = l1
        var node2 = l2
        var result: ListNode? = ListNode(0)
        let fakeHead = result
        
        while node1 != nil && node2 != nil {
            if node1!.val <= node2!.val {
                result?.next = ListNode(node1!.val)
                node1 = node1!.next
            } else {
                result?.next = ListNode(node2!.val)
                node2 = node2?.next
            }
            result = result?.next
        }
        
        if node1 == nil {
           result?.next = node2
        } else {
            result?.next = node1
        }
        
        return fakeHead!.next
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
