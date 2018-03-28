//
//  PathSumTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 12/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [PathSum](./LeetCode/PathSum.swift).
//

import XCTest
@testable import LeetCode

class PathSumTests: XCTestCase {
    
    func testHasPathSum() {
        let ps = PathSum()
        
        XCTAssertFalse(ps.hasPathSum(nil, 1))
        
        XCTAssertTrue(ps.hasPathSum(PathSum.TreeNode(1), 1))
        
        let node = PathSum.TreeNode(5)
        node.left = PathSum.TreeNode(4)
        node.right = PathSum.TreeNode(8)
        node.left?.left = PathSum.TreeNode(11)
        node.left?.left?.left = PathSum.TreeNode(7)
        node.left?.left?.right = PathSum.TreeNode(2)
        node.right = PathSum.TreeNode(8)
        node.right?.left = PathSum.TreeNode(13)
        node.right?.right = PathSum.TreeNode(4)
        node.right?.right?.right = PathSum.TreeNode(1)
        
        XCTAssertTrue(ps.hasPathSum(node, 22))
    }
    
}
