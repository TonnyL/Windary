//
//  BinaryTreeLevelOrderTraversalIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 19/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [BinaryTreeLevelOrderTraversalII](./LeetCode/BinaryTreeLevelOrderTraversalII.swift).
//

import XCTest
@testable import LeetCode

class BinaryTreeLevelOrderTraversalIITests: XCTestCase {
    
    func testLevelOrderBottom() {
        let b = BinaryTreeLevelOrderTraversalII()
        
        XCTAssertTrue(b.levelOrderBottom(nil).isEmpty)
        
        let node0 = BinaryTreeLevelOrderTraversalII.TreeNode(1)
        XCTAssertEqual(b.levelOrderBottom(node0), [[1]])
        
        let node1 = BinaryTreeLevelOrderTraversalII.TreeNode(3)
        node1.left = BinaryTreeLevelOrderTraversalII.TreeNode(9)
        node1.right = BinaryTreeLevelOrderTraversalII.TreeNode(20)
        node1.right?.left = BinaryTreeLevelOrderTraversalII.TreeNode(15)
        node1.right?.right = BinaryTreeLevelOrderTraversalII.TreeNode(7)
        XCTAssertEqual(b.levelOrderBottom(node1), [[15, 7], [9, 20],[3]])
    }
    
}
