//
//  LinkedListCycle.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 22/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a linked list, determine if it has a cycle in it.
//
//  Follow up:
//  Can you solve it without using extra space?
//
//  See [LinkedListCycleTests](./LeetCodeTests/LinkedListCycleTests.swift) for test cases.
//

import Foundation

class LinkedListCycle {
    
    // Waiting to be judged.
    func hasCycle(_ head: ListNode?) -> Bool {
        if head == nil || head?.next == nil {
            return false
        }
        var node = head?.next
        while node !== head {
            if node === nil {
                return false
            }
            node = node?.next
        }
        return true
    }
    
    // Waiting to be judged.
    /*func hasCycle(_ head: ListNode?) -> Bool {
        var slow = head
        var fast = head
        while fast != nil && fast?.next != nil {
            slow = slow?.next
            fast = fast?.next?.next
            if slow === fast {
                return true
            }
        }
        return false
    }*/
    
    public class ListNode {
        
        public var val: Int
        public var next: ListNode?
        
        public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
    }
    
}
