//
//  MergeTwoSortedListsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 07/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//

import XCTest
@testable import LeetCode

class MergeTwoSortedListsTests: XCTestCase {
    
    func testMergeTwoLists() {
        let m = MergeTwoSortedLists()
        
        var node1 = MergeTwoSortedLists.ListNode(1)
        node1.next = MergeTwoSortedLists.ListNode(2)
        node1.next?.next = MergeTwoSortedLists.ListNode(4)
        
        var node2 = MergeTwoSortedLists.ListNode(1)
        node2.next = MergeTwoSortedLists.ListNode(3)
        node2.next?.next = MergeTwoSortedLists.ListNode(4)
        
        // Expected: 1->1->2->3->4->4
        print(m.mergeTwoLists(node1, node2))
        
        // Expected: 1->2->4
        print(m.mergeTwoLists(node1, nil))

        // Expected: 1->3->4
        print(m.mergeTwoLists(nil, node2))

        // Expected: nil
        XCTAssertNil(m.mergeTwoLists(nil, nil))
    }
    
}
