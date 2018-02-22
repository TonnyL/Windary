//
//  LinkedListCycleTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 22/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [LinkedListCycle](./LeetCode/LinkedListCycle.swift).
//

import XCTest
@testable import LeetCode

class LinkedListCycleTests: XCTestCase {
    
    func testHasCycle() {
        let l = LinkedListCycle()
        
        XCTAssertFalse(l.hasCycle(nil))
        
        XCTAssertFalse(l.hasCycle(LinkedListCycle.ListNode(0)))
        
        let node0 = LinkedListCycle.ListNode(0)
        node0.next = LinkedListCycle.ListNode(1)
        node0.next?.next = node0
        XCTAssertTrue(l.hasCycle(node0))
        
        let node1 = LinkedListCycle.ListNode(0)
        node1.next = LinkedListCycle.ListNode(1)
        node1.next?.next = LinkedListCycle.ListNode(2)
        node1.next?.next?.next = LinkedListCycle.ListNode(0)
        XCTAssertFalse(l.hasCycle(node1))
    }
    
}
