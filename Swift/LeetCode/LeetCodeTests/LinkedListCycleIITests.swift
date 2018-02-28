//
//  LinkedListCycleIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 28/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [LinkedListCycleII](./LeetCode/LinkedListCycleII.swift).
//

import XCTest
@testable import LeetCode

class LinkedListCycleIITests: XCTestCase {
    
    func testDetectCycle() {
        let l = LinkedListCycleII()
        
        XCTAssertNil(l.detectCycle(nil))
        
        XCTAssertNil(l.detectCycle(LinkedListCycleII.ListNode(0)))
    }
    
}
