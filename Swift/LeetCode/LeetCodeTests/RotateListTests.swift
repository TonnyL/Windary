//
//  RotateListTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 06/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [RotateList](./LeetCode/RotateList.swift).
//

import XCTest
@testable import LeetCode

class RotateListTests: XCTestCase {
    
    func testRotateRight() {
        let rl = RotateList()

        XCTAssertNil(rl.rotateRight(nil, 1))
        
        XCTAssertTrue(rl.rotateRight(RotateList.ListNode(1), 1) == RotateList.ListNode(1))
        
        let node12 = RotateList.ListNode(1)
        node12.next = RotateList.ListNode(2)
        let node12r = RotateList.ListNode(1)
        node12r.next = RotateList.ListNode(2)
        XCTAssertTrue(rl.rotateRight(node12, 0) == node12r)
        
        let node123 = RotateList.ListNode(1)
        node123.next = RotateList.ListNode(2)
        node123.next?.next = RotateList.ListNode(3)
        let node123r = RotateList.ListNode(3)
        node123r.next = RotateList.ListNode(1)
        node123r.next?.next = RotateList.ListNode(2)
        XCTAssertTrue(rl.rotateRight(node123, 1) == node123r)
        
        let node12345 = RotateList.ListNode(1)
        node12345.next = RotateList.ListNode(2)
        node12345.next?.next = RotateList.ListNode(3)
        node12345.next?.next?.next = RotateList.ListNode(4)
        node12345.next?.next?.next?.next = RotateList.ListNode(5)
        let node12345r = RotateList.ListNode(4)
        node12345r.next = RotateList.ListNode(5)
        node12345r.next?.next = RotateList.ListNode(1)
        node12345r.next?.next?.next = RotateList.ListNode(2)
        node12345r.next?.next?.next?.next = RotateList.ListNode(3)
        XCTAssertTrue(rl.rotateRight(node12345, 2) == node12345r)
    }
    
}
