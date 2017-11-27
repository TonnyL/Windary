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
        
        // Expected: 1 -> 2 -> 5
        var node1233445: RemoveDuplicatesFromSortedListII.ListNode? = RemoveDuplicatesFromSortedListII.ListNode(1)
        node1233445?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node1233445?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(3)
        node1233445?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(3)
        node1233445?.next?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(4)
        node1233445?.next?.next?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(4)
        node1233445?.next?.next?.next?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(5)
        print(r.deleteDuplicates(node1233445))
        
        // Expected: 2 -> 3
        var node11123: RemoveDuplicatesFromSortedListII.ListNode? = RemoveDuplicatesFromSortedListII.ListNode(1)
        node11123?.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        node11123?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        node11123?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node11123?.next?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(3)
        print(r.deleteDuplicates(node11123))
        
        var node111: RemoveDuplicatesFromSortedListII.ListNode? = RemoveDuplicatesFromSortedListII.ListNode(1)
        node111?.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        node111?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        XCTAssertNil(r.deleteDuplicates(node111))
        
        XCTAssertNil(r.deleteDuplicates(nil))
        
        // Expected: 1
        var node122: RemoveDuplicatesFromSortedListII.ListNode? = RemoveDuplicatesFromSortedListII.ListNode(1)
        node122?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node122?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        print(r.deleteDuplicates(node122))
        
        var node11: RemoveDuplicatesFromSortedListII.ListNode? = RemoveDuplicatesFromSortedListII.ListNode(1)
        node11?.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        XCTAssertNil(r.deleteDuplicates(node11))
        
        var node1122: RemoveDuplicatesFromSortedListII.ListNode? = RemoveDuplicatesFromSortedListII.ListNode(1)
        node1122?.next = RemoveDuplicatesFromSortedListII.ListNode(1)
        node1122?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        node1122?.next?.next?.next = RemoveDuplicatesFromSortedListII.ListNode(2)
        XCTAssertNil(r.deleteDuplicates(node1122))
    }
    
}
