//
//  SameTreeTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SameTree](./LeetCode/SameTree.swift).
//

import XCTest
@testable import LeetCode

class SameTreeTests: XCTestCase {
    
    func testExample() {
        let st = SameTree()

        XCTAssertTrue(st.isSameTree(nil, nil))
        
        let tn1 = SameTree.TreeNode(1)
        
        XCTAssertFalse(st.isSameTree(nil, tn1))

        XCTAssertFalse(st.isSameTree(tn1, nil))
        
        let tn2 = SameTree.TreeNode(2)
        XCTAssertFalse(st.isSameTree(tn1, tn2))
        
        let tn1111 = SameTree.TreeNode(1)
        tn1111.left = SameTree.TreeNode(1)
        tn1111.right = SameTree.TreeNode(1)
        let tn2111 = SameTree.TreeNode(1)
        tn2111.left = SameTree.TreeNode(1)
        tn2111.right = SameTree.TreeNode(1)
        XCTAssertTrue(st.isSameTree(tn1111, tn2111))
    }
    
}
