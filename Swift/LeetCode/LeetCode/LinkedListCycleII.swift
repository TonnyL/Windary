//
//  LinkedListCycleII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 28/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//  Note: Do not modify the linked list.
//
//  Follow up:
//  Can you solve it without using extra space?
//
//  See [LinkedListCycleIITests](./LeetCodeTests/LinkedListCycleIITests.swift) for test cases.
//

import Foundation

class LinkedListCycleII {
    
    // Waiting to be judged.
    func detectCycle(_ head: ListNode?) -> ListNode? {
        var slow = head
        var fast = head
        var h = head
        while fast != nil && fast?.next != nil {
            slow = slow?.next
            fast = fast?.next?.next
            if slow === fast {
                while slow !== head {
                    h = h?.next
                    slow = slow?.next
                }
                return h
            }
        }
        return nil
    }
    
    public class ListNode {
        
        public var val: Int
        public var next: ListNode?
        
        public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
    }
    
}
