//
//  ValidateBinarySearchTreeTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 11/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [ValidateBinarySearchTree](./LeetCode/ValidateBinarySearchTree.swift).
//

import XCTest
@testable import LeetCode

class ValidateBinarySearchTreeTests: XCTestCase {
    
    func testIsValidBST() {
        let v = ValidateBinarySearchTree()
        
        XCTAssertTrue(v.isValidBST(nil))
        
        let node213 = ValidateBinarySearchTree.TreeNode(2)
        node213.left = ValidateBinarySearchTree.TreeNode(1)
        node213.right = ValidateBinarySearchTree.TreeNode(3)
        XCTAssertTrue(v.isValidBST(node213))
        
        XCTAssertTrue(v.isValidBST(ValidateBinarySearchTree.TreeNode(1)))
        
        let node123 = ValidateBinarySearchTree.TreeNode(1)
        node123.left = ValidateBinarySearchTree.TreeNode(2)
        node123.right = ValidateBinarySearchTree.TreeNode(3)
        XCTAssertFalse(v.isValidBST(node123))
        
        let node321 = ValidateBinarySearchTree.TreeNode(3)
        node321.left = ValidateBinarySearchTree.TreeNode(2)
        node321.left?.left = ValidateBinarySearchTree.TreeNode(1)
        XCTAssertTrue(v.isValidBST(node321))
        
        let node10 = ValidateBinarySearchTree.TreeNode(1)
        node10.right = ValidateBinarySearchTree.TreeNode(0)
        XCTAssertFalse(v.isValidBST(node10))
        
        let node0Minus1 = ValidateBinarySearchTree.TreeNode(0)
        node0Minus1.left = ValidateBinarySearchTree.TreeNode(-1)
        XCTAssertTrue(v.isValidBST(node0Minus1))
    }
    
}
