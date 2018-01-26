//
//  RemoveDuplicatesFromSortedListIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [RemoveDuplicatesFromSortedListII](./LeetCode/RemoveDuplicatesFromSortedListII.swift).
//

import XCTest
@testable import LeetCode

class RemoveDuplicatesFromSortedListIITests: XCTestCase {
    
    func testDeleteDuplicates() {
        let r = RemoveDuplicatesFromSortedListII()
        
        let node1233445 = RemoveDuplicatesFromSortedListII.ListNode(1)
        node1233445.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node1233445.next?.next = RemoveDuplicatesFromSortedListII.ListNode(3)
        node1233445.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(3)
        node1233445.next?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(4)
        node1233445.next?.next?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(4)
        node1233445.next?.next?.next?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(5)
        
        let node1233445r = RemoveDuplicatesFromSortedListII.ListNode(1)
        node1233445r.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node1233445r.next?.next = RemoveDuplicatesFromSortedListII.ListNode(5)
        XCTAssertTrue(r.deleteDuplicates(node1233445) == node1233445r)
        
        // Expected: 2 -> 3
        let node11123 = RemoveDuplicatesFromSortedListII.ListNode(1)
        node11123.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        node11123.next?.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        node11123.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node11123.next?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(3)
        
        let node11123r = RemoveDuplicatesFromSortedListII.ListNode(2)
        node11123r.next = RemoveDuplicatesFromSortedListII.ListNode(3)
        XCTAssertTrue(r.deleteDuplicates(node11123) == node11123r)
        
        let node111 = RemoveDuplicatesFromSortedListII.ListNode(1)
        node111.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        node111.next?.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        XCTAssertNil(r.deleteDuplicates(node111))
        
        XCTAssertNil(r.deleteDuplicates(nil))
        
        let node122 = RemoveDuplicatesFromSortedListII.ListNode(1)
        node122.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node122.next?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        XCTAssertTrue(r.deleteDuplicates(node122) == RemoveDuplicatesFromSortedListII.ListNode(1))
        
        let node11 = RemoveDuplicatesFromSortedListII.ListNode(1)
        node11.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        XCTAssertNil(r.deleteDuplicates(node11))
        
        let node1122 = RemoveDuplicatesFromSortedListII.ListNode(1)
        node1122.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        node1122.next?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node1122.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        XCTAssertNil(r.deleteDuplicates(node1122))
    }
    
}
