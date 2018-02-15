//
//  SymmetricTreeTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 15/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [SymmetricTree](./LeetCode/SymmetricTree.swift).
//

import XCTest
@testable import LeetCode

class SymmetricTreeTests: XCTestCase {
    
    func testIsSymmetric() {
        let st = SymmetricTree()
        XCTAssertTrue(st.isSymmetric(nil))
        
        var node0 = SymmetricTree.TreeNode(1)
        node0.left = SymmetricTree.TreeNode(2)
        node0.right = SymmetricTree.TreeNode(2)
        node0.left?.left = SymmetricTree.TreeNode(3)
        node0.left?.right = SymmetricTree.TreeNode(4)
        node0.right?.left = SymmetricTree.TreeNode(4)
        node0.right?.right = SymmetricTree.TreeNode(3)
        XCTAssertTrue(st.isSymmetric(node0))
        
        let node1 = SymmetricTree.TreeNode(1)
        node1.left = SymmetricTree.TreeNode(2)
        node1.left?.right = SymmetricTree.TreeNode(3)
        node1.right = SymmetricTree.TreeNode(2)
        node1.right?.right = SymmetricTree.TreeNode(3)
        XCTAssertFalse(st.isSymmetric(node1))
    }
    
}
