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

        let node0 = ListNode(0)
        let node5 = ListNode(5)
        print("result: [0] + [0] -> \(atn.addTwoNumbers(node0, node0)?.val)")
        print("result: [5] + [5] -> \(atn.addTwoNumbers(node5, node5)?.val)")

        let node243 = ListNode(2)
        node243.next = ListNode(4)
        node243.next?.next = ListNode(3)

        let node564 = ListNode(5)
        node564.next = ListNode(6)
        node564.next?.next = ListNode(4)

        var tmp = atn.addTwoNumbers(node243, node564)
        print("result: [2,4,3] + [5,6,4] -> \(tmp?.val) -> \(tmp?.next?.val) -> \(tmp?.next?.next?.val)")

        let node1 = ListNode(1)
        let node99 = ListNode(9)
        node99.next = ListNode(9)
        tmp = atn.addTwoNumbers(node1, node99)
        print("result: [1] + [9,9] -> \(tmp?.val) -> \(tmp?.next?.val) -> \(tmp?.next?.next?.val)")
    }

}
