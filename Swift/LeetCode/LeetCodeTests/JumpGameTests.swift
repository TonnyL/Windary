//
//  JumpGameTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 04/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//
//  Test cases for [JumpGame](./LeetCode/JumpGame.swift).
//

import XCTest
@testable import LeetCode

class JumpGameTests: XCTestCase {
    
    func testCanJump() {
        let jg = JumpGame()
        
        XCTAssertFalse(jg.canJump([]))
        
        XCTAssertTrue(jg.canJump([1]))
        
        XCTAssertTrue(jg.canJump([0]))
        
        XCTAssertTrue(jg.canJump([2, 3, 1, 1, 4]))
        
        XCTAssertFalse(jg.canJump([3, 2, 1, 0, 4]))
        
        XCTAssertTrue(jg.canJump([4, 0, 0, 0]))
    }
    
}
