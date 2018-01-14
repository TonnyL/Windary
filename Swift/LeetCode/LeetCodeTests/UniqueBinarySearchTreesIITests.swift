//
//  UniqueBinarySearchTreesIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 14/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [UniqueBinarySearchTreesII](./LeetCode/UniqueBinarySearchTreesII.swift).
//

import XCTest
@testable import LeetCode

class UniqueBinarySearchTreesIITests: XCTestCase {
    
    func testGenerateTrees() {
        let u = UniqueBinarySearchTreesII()
        
        // Expected:
        // nil
        print(u.generateTrees(0))
        
        // Expected:
        // 1
        print(u.generateTrees(1))
        
        // Expected:
        // 2  1
        // /   \
        // 1    2
        print(u.generateTrees(2))
        
        // Expected:
        // 1       3     3      2      1
        // \      /     /      / \      \
        // 3     2     1      1  3      2
        // /    /       \                \
        // 2   1        2                 3
        print(u.generateTrees(3))
    }
    
}
