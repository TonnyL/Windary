//
//  PartitionListTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 07/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [PartitionList](./LeetCode/PartitionList.swift).
//

import XCTest
@testable import LeetCode

class PartitionListTests: XCTestCase {
    
    func testPartition() {
        let pl = PartitionList()
        
        XCTAssertNil(pl.partition(nil, 2))
        
        let node12 = PartitionList.ListNode(1)
        node12.next = PartitionList.ListNode(2)
        let node12r = PartitionList.ListNode(1)
        node12r.next = PartitionList.ListNode(2)
        XCTAssertTrue(pl.partition(node12, 3) == node12r)
        XCTAssertTrue(pl.partition(node12, 0) == node12r)
        
        let node143252 = PartitionList.ListNode(1)
        node143252.next = PartitionList.ListNode(4)
        node143252.next?.next = PartitionList.ListNode(3)
        node143252.next?.next?.next = PartitionList.ListNode(2)
        node143252.next?.next?.next?.next = PartitionList.ListNode(5)
        node143252.next?.next?.next?.next?.next = PartitionList.ListNode(2)
        let node122435 = PartitionList.ListNode(1)
        node122435.next = PartitionList.ListNode(2)
        node122435.next?.next = PartitionList.ListNode(2)
        node122435.next?.next?.next = PartitionList.ListNode(4)
        node122435.next?.next?.next?.next = PartitionList.ListNode(3)
        node122435.next?.next?.next?.next?.next = PartitionList.ListNode(5)
        XCTAssertTrue(pl.partition(node143252, 3) == node122435)
        
        let node132245 = PartitionList.ListNode(1)
        node132245.next = PartitionList.ListNode(3)
        node132245.next?.next = PartitionList.ListNode(2)
        node132245.next?.next?.next = PartitionList.ListNode(2)
        node132245.next?.next?.next?.next = PartitionList.ListNode(4)
        node132245.next?.next?.next?.next?.next = PartitionList.ListNode(5)
        XCTAssertTrue(pl.partition(node143252, 4) == node132245)
    }
    
}
