//
//  BinaryTreeLevelOrderTraversalTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 18/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [BinaryTreeLevelOrderTraversal](./LeetCode/BinaryTreeLevelOrderTraversal.swift).
//

import XCTest
@testable import LeetCode

class BinaryTreeLevelOrderTraversalTests: XCTestCase {
    
    func testLevelOrder() {
        let b = BinaryTreeLevelOrderTraversal()
        
        XCTAssertTrue(b.levelOrder(nil).isEmpty)
        
        let node0 = BinaryTreeLevelOrderTraversal.TreeNode(1)
        XCTAssertEqual(b.levelOrder(node0), [[1]])
        
        let node1 = BinaryTreeLevelOrderTraversal.TreeNode(3)
        node1.left = BinaryTreeLevelOrderTraversal.TreeNode(9)
        node1.right = BinaryTreeLevelOrderTraversal.TreeNode(20)
        node1.right?.left = BinaryTreeLevelOrderTraversal.TreeNode(15)
        node1.right?.right = BinaryTreeLevelOrderTraversal.TreeNode(7)
        XCTAssertEqual(b.levelOrder(node1), [[3], [9, 20], [15, 7]])
        
    }
    
}
