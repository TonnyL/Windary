//
//  BinaryTreeInorderTraversalTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 28/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [BinaryTreeInorderTraversal](./LeetCodeTests/BinaryTreeInorderTraversal.TreeNodeTests.swift).
//

import XCTest
@testable import LeetCode

class BinaryTreeInorderTraversalTests: XCTestCase {
    
    func testInorderTraversal() {
        let b = BinaryTreeInorderTraversal()
        
        XCTAssertTrue(b.inorderTraversal(nil).isEmpty)
        
        let node132: BinaryTreeInorderTraversal.TreeNode = BinaryTreeInorderTraversal.TreeNode(1)
        let right = BinaryTreeInorderTraversal.TreeNode(2)
        right.left = BinaryTreeInorderTraversal.TreeNode(3)
        node132.right = right
        
        XCTAssertTrue(b.inorderTraversal(node132) == [1, 3, 2])
        
        let node4251637 = BinaryTreeInorderTraversal.TreeNode(1)
        let node2 = BinaryTreeInorderTraversal.TreeNode(2)
        let node3 = BinaryTreeInorderTraversal.TreeNode(3)
        node2.left = BinaryTreeInorderTraversal.TreeNode(4)
        node2.right = BinaryTreeInorderTraversal.TreeNode(5)
        node3.left = BinaryTreeInorderTraversal.TreeNode(6)
        node3.right = BinaryTreeInorderTraversal.TreeNode(7)
        node4251637.left = node2
        node4251637.right = node3
        
        XCTAssertTrue(b.inorderTraversal(node4251637) == [4, 2, 5, 1, 6, 3, 7])
    }
    
}
