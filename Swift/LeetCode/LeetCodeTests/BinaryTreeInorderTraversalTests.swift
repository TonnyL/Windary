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
        
        print(b.inorderTraversal(nil))
        
        var node132: BinaryTreeInorderTraversal.TreeNode = BinaryTreeInorderTraversal.TreeNode(1)
        var right = BinaryTreeInorderTraversal.TreeNode(2)
        right.left = BinaryTreeInorderTraversal.TreeNode(3)
        node132.right = right
        
        print(b.inorderTraversal(node132))
        
        var node4251637 = BinaryTreeInorderTraversal.TreeNode(1)
        var node2 = BinaryTreeInorderTraversal.TreeNode(2)
        var node3 = BinaryTreeInorderTraversal.TreeNode(3)
        node2.left = BinaryTreeInorderTraversal.TreeNode(4)
        node2.right = BinaryTreeInorderTraversal.TreeNode(5)
        node3.left = BinaryTreeInorderTraversal.TreeNode(6)
        node3.right = BinaryTreeInorderTraversal.TreeNode(7)
        node4251637.left = node2
        node4251637.right = node3
        
        print(b.inorderTraversal(node4251637))
    }
    
}
