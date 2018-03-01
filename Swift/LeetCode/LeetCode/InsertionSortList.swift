//
//  InsertionSortList.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 01/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Sort a linked list using insertion sort.
//
//  Accepted. See [InsertionSortListTests](./LeetCodeTests/InsertionSortListTests.swift) for test cases.
//

import Foundation

class InsertionSortList {
    
    func insertionSortList(_ head: ListNode?) -> ListNode? {
        let fakeHead = ListNode(0)
        var node = head
        
        while node != nil {
            var pre: ListNode? = fakeHead
            
            while pre?.next != nil && (pre?.next!.val)! <= node!.val {
                pre = pre?.next
            }
            
            let headNext = node?.next
            node?.next = pre?.next
            
            pre?.next = node
            node = headNext
        }
        
        return fakeHead.next
    }
    
    public class ListNode: Equatable {
        
         public var val: Int
         public var next: ListNode?
        
         public init(_ val: Int) {
            self.val = val
            self.next = nil
        }
        
        public static func == (lhs: InsertionSortList.ListNode, rhs: InsertionSortList.ListNode) -> Bool {
            return lhs.val == rhs.val && lhs.next == rhs.next
        }
        
    }
    
}
