//
//  RemoveDuplicatesFromSortedList.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//  For example,
//  Given 1->1->2, return 1->2.
//  Given 1->1->2->3->3, return 1->2->3.
//
//  Accepted. See [RemoveDuplicatesFromSortedList](./LeetCodeTests/RemoveDuplicatesFromSortedListTests.swift) for test cases.
//

import Foundation

class RemoveDuplicatesFromSortedList {
    
    func deleteDuplicates(_ head: ListNode?) -> ListNode? {
        var node: ListNode? = head
        
        while node != nil && node?.next != nil {
            if node?.val == node?.next?.val {
                let tmp: ListNode? = node?.next
                node?.next = tmp?.next
                tmp?.next = nil
            } else {
                node = node?.next
            }
        }
        
        return head
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
