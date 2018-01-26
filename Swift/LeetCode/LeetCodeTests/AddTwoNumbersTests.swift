//
//  AddTwoNumbersTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [AddTwoNumbers](./LeetCode/AddTwoNumbers.swift).
//

import XCTest
@testable import LeetCode

class AddTwoNumbersTests: XCTestCase {

    func testAddTwoNumbers() {
        let atn = AddTwoNumbers()

        let node0 = AddTwoNumbers.ListNode(0)
        let node5 = AddTwoNumbers.ListNode(5)
        XCTAssertTrue(atn.addTwoNumbers(node0, node0) == AddTwoNumbers.ListNode(0))
        
        let node5Plus5 = AddTwoNumbers.ListNode(0)
        node5Plus5.next = AddTwoNumbers.ListNode(1)
        XCTAssertTrue(atn.addTwoNumbers(node5, node5) == node5Plus5)

        let node243 = AddTwoNumbers.ListNode(2)
        node243.next = AddTwoNumbers.ListNode(4)
        node243.next?.next = AddTwoNumbers.ListNode(3)

        let node564 = AddTwoNumbers.ListNode(5)
        node564.next = AddTwoNumbers.ListNode(6)
        node564.next?.next = AddTwoNumbers.ListNode(4)

        let node243Plus564 = AddTwoNumbers.ListNode(7)
        node243Plus564.next = AddTwoNumbers.ListNode(0)
        node243Plus564.next?.next = AddTwoNumbers.ListNode(8)
        XCTAssertTrue(atn.addTwoNumbers(node243, node564) == node243Plus564)

        let node1 = AddTwoNumbers.ListNode(1)
        let node99 = AddTwoNumbers.ListNode(9)
        node99.next = AddTwoNumbers.ListNode(9)
        let node1Plus99 = AddTwoNumbers.ListNode(0)
        node1Plus99.next = AddTwoNumbers.ListNode(0)
        node1Plus99.next?.next = AddTwoNumbers.ListNode(1)
        XCTAssertTrue(atn.addTwoNumbers(node1, node99) == node1Plus99)
    }

}
