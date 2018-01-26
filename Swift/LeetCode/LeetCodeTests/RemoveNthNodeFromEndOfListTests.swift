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
        
        let node12345 = RemoveNthNodeFromEndOfList.ListNode(1)
        node12345.next = RemoveNthNodeFromEndOfList.ListNode(2)
        node12345.next?.next = RemoveNthNodeFromEndOfList.ListNode(3)
        node12345.next?.next?.next = RemoveNthNodeFromEndOfList.ListNode(4)
        node12345.next?.next?.next?.next = RemoveNthNodeFromEndOfList.ListNode(5)
        let node12345Remove2 = RemoveNthNodeFromEndOfList.ListNode(1)
        node12345Remove2.next = RemoveNthNodeFromEndOfList.ListNode(2)
        node12345Remove2.next?.next = RemoveNthNodeFromEndOfList.ListNode(3)
        node12345Remove2.next?.next?.next = RemoveNthNodeFromEndOfList.ListNode(5)
        XCTAssertTrue(r.removeNthFromEnd(node12345, 2) == node12345Remove2)
        
        let node12 = RemoveNthNodeFromEndOfList.ListNode(1)
        node12.next = RemoveNthNodeFromEndOfList.ListNode(2)
        print(r.removeNthFromEnd(node12, 1) == RemoveNthNodeFromEndOfList.ListNode(1))
        
        XCTAssertNil(r.removeNthFromEnd(RemoveNthNodeFromEndOfList.ListNode(1), 1))
        
        XCTAssertNil(r.removeNthFromEnd(nil, 2))
        
        var node123: RemoveNthNodeFromEndOfList.ListNode? = RemoveNthNodeFromEndOfList.ListNode(1)
        node123?.next = RemoveNthNodeFromEndOfList.ListNode(2)
        node123?.next?.next = RemoveNthNodeFromEndOfList.ListNode(3)
        let node123Remove3 = RemoveNthNodeFromEndOfList.ListNode(2)
        node123Remove3.next = RemoveNthNodeFromEndOfList.ListNode(3)
        node123 = r.removeNthFromEnd(node123, 3)
        XCTAssertTrue(node123 == node123Remove3)
        XCTAssertTrue(r.removeNthFromEnd(node123, 1) == RemoveNthNodeFromEndOfList.ListNode(2))
        XCTAssertNil(r.removeNthFromEnd(node123, 1))
    }
    
}
