//
//  MergeTwoSortedListsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 07/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//
//  Test cases for [MergeTwoSortedLists](./LeetCode/MergeTwoSortedLists.swift).
//

import XCTest
@testable import LeetCode

class MergeTwoSortedListsTests: XCTestCase {
    
    func testMergeTwoLists() {
        let m = MergeTwoSortedLists()
        
        let node1 = MergeTwoSortedLists.ListNode(1)
        node1.next = MergeTwoSortedLists.ListNode(2)
        node1.next?.next = MergeTwoSortedLists.ListNode(4)
        
        let node2 = MergeTwoSortedLists.ListNode(1)
        node2.next = MergeTwoSortedLists.ListNode(3)
        node2.next?.next = MergeTwoSortedLists.ListNode(4)
        
        let node124Merge134 = MergeTwoSortedLists.ListNode(1)
        node124Merge134.next = MergeTwoSortedLists.ListNode(1)
        node124Merge134.next?.next = MergeTwoSortedLists.ListNode(2)
        node124Merge134.next?.next?.next = MergeTwoSortedLists.ListNode(3)
        node124Merge134.next?.next?.next?.next = MergeTwoSortedLists.ListNode(4)
        node124Merge134.next?.next?.next?.next?.next = MergeTwoSortedLists.ListNode(4)
        XCTAssertTrue(m.mergeTwoLists(node1, node2) == node124Merge134)
        
        let node123MergeNil = MergeTwoSortedLists.ListNode(1)
        node123MergeNil.next = MergeTwoSortedLists.ListNode(2)
        node123MergeNil.next?.next = MergeTwoSortedLists.ListNode(4)
        XCTAssertTrue(m.mergeTwoLists(node1, nil) == node123MergeNil)

        let node134MergeNil = MergeTwoSortedLists.ListNode(1)
        node134MergeNil.next = MergeTwoSortedLists.ListNode(3)
        node134MergeNil.next?.next = MergeTwoSortedLists.ListNode(4)
        XCTAssertTrue(m.mergeTwoLists(nil, node2) == node134MergeNil)

        XCTAssertNil(m.mergeTwoLists(nil, nil))
    }
    
}
