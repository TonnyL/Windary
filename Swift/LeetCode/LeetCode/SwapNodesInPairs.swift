//
//  SwapNodesInPairs.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 03/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a linked list, swap every two adjacent nodes and return its head.
//
//  For example,
//  Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//  Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
//
//  Accepted. See [SwapNodesInPairsTests](./LeetCodeTests/SwapNodesInPairsTests.swift) for test cases.
//

import Foundation

class SwapNodesInPairs {
    
    func swapPairs(_ head: ListNode?) -> ListNode? {
        if head == nil || head?.next == nil {
            return head
        }
        var pre = head
        var nxt = pre?.next
        
        while pre != nil && nxt != nil {
            let tmp = nxt?.val
            nxt?.val = (pre?.val)!
            pre?.val = tmp!
            
            pre = nxt?.next
            if pre != nil {
                nxt = pre?.next
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
