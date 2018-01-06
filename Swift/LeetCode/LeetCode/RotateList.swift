//
//  RotateList.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 06/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a list, rotate the list to the right by k places, where k is non-negative.
//
//  Example:
//
//  Given 1->2->3->4->5->NULL and k = 2,
//
//  return 4->5->1->2->3->NULL.
//
//  Acceptd. See [RotateListTests](./LeetCodeTests/RotateListTests.swift) for test cases.
//

import Foundation

class RotateList {
    
    func rotateRight(_ head: ListNode?, _ k: Int) -> ListNode? {
        var anotherHead = head
        var anotherK = k
        if anotherHead == nil || anotherHead?.next == nil {
            return head
        }
        
        var node = anotherHead
        var length = 1
        while node?.next != nil {
            length += 1
            node = node?.next
        }
        
        node?.next = anotherHead
        anotherK %= length
        
        var i = 0
        while i < length - anotherK {
            node = node?.next
            
            i += 1
        }
        anotherHead = node?.next
        node?.next = nil
        
        return anotherHead
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
