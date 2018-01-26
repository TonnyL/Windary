//
//  RemoveDuplicatesFromSortedListTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [RemoveDuplicatesFromSortedList](./LeetCode/RemoveDuplicatesFromSortedList.swift).
//

import XCTest
@testable import LeetCode

class RemoveDuplicatesFromSortedListTests: XCTestCase {
    
    func testDeleteDuplicates() {
        let r = RemoveDuplicatesFromSortedList()
        
        XCTAssertNil(r.deleteDuplicates(nil))
        
        let node112 = RemoveDuplicatesFromSortedList.ListNode(1)
        node112.next = RemoveDuplicatesFromSortedList.ListNode(1)
        node112.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        let node112r = RemoveDuplicatesFromSortedList.ListNode(1)
        node112r.next = RemoveDuplicatesFromSortedList.ListNode(2)
        XCTAssertTrue(r.deleteDuplicates(node112) == node112r)
        
        let node11233 = RemoveDuplicatesFromSortedList.ListNode(1)
        node11233.next = RemoveDuplicatesFromSortedList.ListNode(1)
        node11233.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node11233.next?.next?.next = RemoveDuplicatesFromSortedList.ListNode(3)
        node11233.next?.next?.next?.next = RemoveDuplicatesFromSortedList.ListNode(3)
        let node11233r = RemoveDuplicatesFromSortedList.ListNode(1)
        node11233r.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node11233r.next?.next = RemoveDuplicatesFromSortedList.ListNode(3)
        XCTAssertTrue(r.deleteDuplicates(node11233) == node11233r)
        
        let node111 = RemoveDuplicatesFromSortedList.ListNode(1)
        node111.next = RemoveDuplicatesFromSortedList.ListNode(1)
        node111.next?.next = RemoveDuplicatesFromSortedList.ListNode(1)
        XCTAssertTrue(r.deleteDuplicates(node111) == RemoveDuplicatesFromSortedList.ListNode(1))
        
        let node1222 = RemoveDuplicatesFromSortedList.ListNode(1)
        node1222.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node1222.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node1222.next?.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        let node1222r = RemoveDuplicatesFromSortedList.ListNode(1)
        node1222r.next = RemoveDuplicatesFromSortedList.ListNode(2)
        XCTAssertTrue(r.deleteDuplicates(node1222) == node1222r)
        
        let node1122 = RemoveDuplicatesFromSortedList.ListNode(1)
        node1122.next = RemoveDuplicatesFromSortedList.ListNode(1)
        node1122.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node1122.next?.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        let node1122r = RemoveDuplicatesFromSortedList.ListNode(1)
        node1122r.next = RemoveDuplicatesFromSortedList.ListNode(2)
        XCTAssertTrue(r.deleteDuplicates(node1122) == node1122r)
    }
    
}
