//
//  RemoveNthNodeFromEndOfListTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 07/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//
//  Test cases for [RemoveNthNodeFromEndOfList](./LeetCode/RemoveNthNodeFromEndOfList.swift).
//

import XCTest
@testable import LeetCode

class RemoveNthNodeFromEndOfListTests: XCTestCase {
    
    func testRemoveNthFromEnd() {
        let r = RemoveNthNodeFromEndOfList()
        
        var node12345 = RemoveNthNodeFromEndOfList.ListNode(1)
        node12345.next = RemoveNthNodeFromEndOfList.ListNode(2)
        node12345.next?.next = RemoveNthNodeFromEndOfList.ListNode(3)
        node12345.next?.next?.next = RemoveNthNodeFromEndOfList.ListNode(4)
        node12345.next?.next?.next?.next = RemoveNthNodeFromEndOfList.ListNode(5)
        
        // Expected: 1->2->3->5
        print(r.removeNthFromEnd(node12345, 2))
        
        var node12 = RemoveNthNodeFromEndOfList.ListNode(1)
        node12.next = RemoveNthNodeFromEndOfList.ListNode(2)
        // Expected: 1
        print(r.removeNthFromEnd(node12, 1))
        
        // Expected: nil
        XCTAssertNil(r.removeNthFromEnd(RemoveNthNodeFromEndOfList.ListNode(1), 1))
        
        // Expected: nil
        XCTAssertNil(r.removeNthFromEnd(nil, 2))
        
        var node123: RemoveNthNodeFromEndOfList.ListNode? = RemoveNthNodeFromEndOfList.ListNode(1)
        node123?.next = RemoveNthNodeFromEndOfList.ListNode(2)
        node123?.next?.next = RemoveNthNodeFromEndOfList.ListNode(3)
        // Expected: 2->3
        node123 = r.removeNthFromEnd(node123, 3)
        print(node123)
        // Expected: 2
        print(r.removeNthFromEnd(node123, 1))
        // Expected: nil
        XCTAssertNil(r.removeNthFromEnd(node123, 1))
    }
    
}
