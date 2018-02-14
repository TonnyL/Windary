//
//  MaximumDepthOfBinaryTreeTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 14/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [MaximumDepthOfBinaryTree](./LeetCode/MaximumDepthOfBinaryTree.swift).
//

import XCTest
@testable import LeetCode

class MaximumDepthOfBinaryTreeTests: XCTestCase {
    
    func testMaxDepth() {
        let m = MaximumDepthOfBinaryTree()
        
        XCTAssertTrue(m.maxDepth(nil) == 0)
        
        let node0 = MaximumDepthOfBinaryTree.TreeNode(3)
        node0.left = MaximumDepthOfBinaryTree.TreeNode(9)
        node0.right = MaximumDepthOfBinaryTree.TreeNode(20)
        node0.right?.left = MaximumDepthOfBinaryTree.TreeNode(15)
        node0.right?.right = MaximumDepthOfBinaryTree.TreeNode(7)
        XCTAssertTrue(m.maxDepth(node0) == 3)
        
        let node1 = MaximumDepthOfBinaryTree.TreeNode(1)
        node1.left = MaximumDepthOfBinaryTree.TreeNode(2)
        node1.left?.left = MaximumDepthOfBinaryTree.TreeNode(3)
        node1.left?.left?.left = MaximumDepthOfBinaryTree.TreeNode(4)
        XCTAssertTrue(m.maxDepth(node1) == 4)
        
    }
    
}
