//
//  IntersectionOfTwoLinkedLists.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 28/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//  Write a program to find the node at which the intersection of two singly linked lists begins.
//
//  For example, the following two linked lists:
//
//  A:          a1 → a2
//                     ↘
//                      c1 → c2 → c3
//                     ↗
//  B:     b1 → b2 → b3
//
//  begin to intersect at node c1.
//
//  Notes:
//
//  If the two linked lists have no intersection at all, return null.
//  The linked lists must retain their original structure after the function returns.
//  You may assume there are no cycles anywhere in the entire linked structure.
//  Your code should preferably run in O(n) time and use only O(1) memory.
//
//  Waiting to be judged.

import Foundation

class IntersectionOfTwoLinkedLists {
    
    func getIntersectionNode(_ headA: ListNode?, _ headB: ListNode? ) -> ListNode? {
        if headA == nil || headB == nil {
            return nil
        }
        
        var a = headA
        var b = headB
        while (a !== b) {
            if a != nil {
                a = a?.next
            } else {
                a = headB
            }
            
            if b != nil {
                b = b?.next
            } else {
                b = headA
            }
            
        }
        
        return a
    }
    
    public class ListNode: Equatable {
        
        public var val: Int
        public var next: ListNode?
        
        public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
        public static func ==(lhs: IntersectionOfTwoLinkedLists.ListNode, rhs: IntersectionOfTwoLinkedLists.ListNode) -> Bool {
            return lhs.val == rhs.val && lhs.next == rhs.next
        }
        
    }
    
}
