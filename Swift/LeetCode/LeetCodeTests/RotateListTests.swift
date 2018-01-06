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
        
        // Expected: None
        XCTAssertNil(rl.rotateRight(nil, 1))
        
        // Expected: 1
        print(rl.rotateRight(RotateList.ListNode(1), 1))
        
        // Expected: 1 -> 2
        var node12 = RotateList.ListNode(1)
        node12.next = RotateList.ListNode(2)
        print(rl.rotateRight(node12, 0))
        
        // Expected: 3 -> 1 -> 2
        var node123 = RotateList.ListNode(1)
        node123.next = RotateList.ListNode(2)
        node123.next?.next = RotateList.ListNode(3)
        print(rl.rotateRight(node123, 1))
        
        var node12345 = RotateList.ListNode(1)
        node12345.next = RotateList.ListNode(2)
        node12345.next?.next = RotateList.ListNode(3)
        node12345.next?.next?.next = RotateList.ListNode(4)
        node12345.next?.next?.next?.next = RotateList.ListNode(5)
        print(rl.rotateRight(node12345, 2))
    }
    
}
