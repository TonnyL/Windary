//
//  ReverseLinkedListII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 07/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Reverse a linked list from position m to n. Do it in-place and in one-pass.
//
//  For example:
//  Given 1->2->3->4->5->NULL, m = 2 and n = 4,
//
//  return 1->4->3->2->5->NULL.
//
//  Note:
//  Given m, n satisfy the following condition:
//  1 ≤ m ≤ n ≤ length of list.
//
//  Accepted. See [ReverseLinkedListIITests](./LeetCodeTests/ReverseLinkedListIITests.swift) for test cases.
//

import Foundation

class ReverseLinkedListII {
    
    func reverseBetween(_ head: ListNode?, _ m: Int, _ n: Int) -> ListNode? {
        var node = head
        var list = Array<ListNode>.init()
        
        var i = 0
        while i <= n - 1 && node != nil {
            if m - 1 <= i {
                list.append(node!)
            }
            
            node = node?.next
            i += 1
        }
        
        while list.count >= 2 {
            let tmp = list[0].val
            list[0].val = list[list.count - 1].val
            list[list.count - 1].val = tmp
            
            list.remove(at: 0)
            list.remove(at: list.count - 1)
        }
        
        return head
    }
    
    public class ListNode: Equatable {
        
        public var val: Int
        public var next: ListNode?
        
        public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
        public static func ==(lhs: ReverseLinkedListII.ListNode, rhs: ReverseLinkedListII.ListNode) -> Bool {
            return lhs.val == rhs.val && lhs.next == rhs.next
        }
        
    }
    
}
