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
        
        // Expected: nil
        print(pl.partition(nil, 2))
        
        // Expected: 1 -> 2
        var node12 = PartitionList.ListNode(1)
        node12.next = PartitionList.ListNode(2)
        print(pl.partition(node12, 3))
        
        // Expected: 1 -> 2
        print(pl.partition(node12, 0))
        
        var node143252 = PartitionList.ListNode(1)
        node143252.next = PartitionList.ListNode(4)
        node143252.next?.next = PartitionList.ListNode(3)
        node143252.next?.next?.next = PartitionList.ListNode(2)
        node143252.next?.next?.next?.next = PartitionList.ListNode(5)
        node143252.next?.next?.next?.next?.next = PartitionList.ListNode(2)
        // Expected: 1 -> 2 -> 2 -> 4 -> 3 -> 5
        print(pl.partition(node143252, 3))
        
        // Expected: 1 -> 3 -> 2 -> 2 -> 4 -> 5
        print(pl.partition(node143252, 4))
    }
    
}
