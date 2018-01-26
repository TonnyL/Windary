//
//  AddTwoNumbers.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  You are given two non-empty linked lists representing two non-negative integers.
//  The digits are stored in reverse order and each of their nodes contain a single digit.
//  Add the two numbers and return it as a linked list.
//
//  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//  Output: 7 -> 0 -> 8
//
//  Accepted. See [AddTwoNumbersTests](./LeetCodeTests/AddTwoNumbersTests.swift) for test cases.
//

import Foundation

class AddTwoNumbers {
    
    func addTwoNumbers(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        if l1 == nil || l2 == nil {
            return nil
        }
        var tmp1 = l1!.next
        var tmp2 = l2!.next
        var results = [ListNode]()
        var addOne = l1!.val + l2!.val >= 10
        var result = ListNode((l1!.val + l2!.val) % 10)
        
        if addOne {
            result.next = ListNode(1)
        }
        results.append(result)
        
        while true {
            if tmp1 == nil && tmp2 == nil {
                break
            } else {
                var tmp = 0
                if tmp1 == nil {
                    tmp = tmp2!.val
                } else if tmp2 == nil {
                    tmp = tmp1!.val
                } else {
                    tmp = tmp1!.val + tmp2!.val
                }
                
                if addOne {
                    tmp += 1
                }
                
                addOne = tmp >= 10
                result = ListNode(tmp % 10)
                
                if addOne {
                    result.next = ListNode(1)
                }
                results.append(result)
                
                if tmp1 != nil {
                    tmp1 = tmp1!.next
                }
                
                if tmp2 != nil {
                    tmp2 = tmp2!.next
                }
            }
        }

        var rst = results[0]
        var i = 1
        while i < results.count {
            rst.next = results[i]
            rst = rst.next!
            i += 1
        }
        
        return results[0]
    }
    
    class ListNode: Equatable {
        
        public var val: Int
        public var next: ListNode?
        
        public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
        static func ==(lhs: AddTwoNumbers.ListNode, rhs: AddTwoNumbers.ListNode) -> Bool {
            return lhs.val == rhs.val && lhs.next == rhs.next
        }
        
    }
    
}
