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
        
        var node112: RemoveDuplicatesFromSortedList.ListNode? = RemoveDuplicatesFromSortedList.ListNode(1)
        node112?.next = RemoveDuplicatesFromSortedList.ListNode(1)
        node112?.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        // Expected: 1 -> 2
        print(r.deleteDuplicates(node112))
        
        var node11233: RemoveDuplicatesFromSortedList.ListNode? = RemoveDuplicatesFromSortedList.ListNode(1)
        node11233?.next = RemoveDuplicatesFromSortedList.ListNode(1)
        node11233?.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node11233?.next?.next?.next = RemoveDuplicatesFromSortedList.ListNode(3)
        node11233?.next?.next?.next?.next = RemoveDuplicatesFromSortedList.ListNode(3)
        // Expected: 1 -> 2 -> 3
        print(r.deleteDuplicates(node11233))
        
        var node111: RemoveDuplicatesFromSortedList.ListNode? = RemoveDuplicatesFromSortedList.ListNode(1)
        node111?.next = RemoveDuplicatesFromSortedList.ListNode(1)
        node111?.next?.next = RemoveDuplicatesFromSortedList.ListNode(1)
        // Expected: 1
        print(r.deleteDuplicates(node111))
        
        var node1222: RemoveDuplicatesFromSortedList.ListNode? = RemoveDuplicatesFromSortedList.ListNode(1)
        node1222?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node1222?.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node1222?.next?.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        // Expected: 1 -> 2
        print(r.deleteDuplicates(node1222))
        
        var node1122: RemoveDuplicatesFromSortedList.ListNode? = RemoveDuplicatesFromSortedList.ListNode(1)
        node1122?.next = RemoveDuplicatesFromSortedList.ListNode(1)
        node1122?.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        node1122?.next?.next?.next = RemoveDuplicatesFromSortedList.ListNode(2)
        // Expected: 1 -> 2
        print(r.deleteDuplicates(node1122))
    }
    
}
