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
        
        XCTAssertTrue(u.generateTrees(0).isEmpty)
        
        // Expected:
        // 1
        let node0 = UniqueBinarySearchTreesII.TreeNode(1)
        let array0 = u.generateTrees(1)
        XCTAssertTrue(array0.count == 1)
        XCTAssertTrue(array0[0] == node0)
        
        // Expected:
        // 2  1
        // /   \
        // 1    2
        let node1 = UniqueBinarySearchTreesII.TreeNode(2)
        node1.left = UniqueBinarySearchTreesII.TreeNode(1)
        let node2 = UniqueBinarySearchTreesII.TreeNode(1)
        node2.right = UniqueBinarySearchTreesII.TreeNode(2)
        let array1 = u.generateTrees(2)
        XCTAssertTrue(array1.count == 2)
        XCTAssertTrue(array1.contains {
            $0 == node1
        })
        XCTAssertTrue(array1.contains {
            $0 == node2
        })
        
        // Expected:
        // 1       3     3      2      1
        // \      /     /      / \      \
        // 3     2     1      1  3      2
        // /    /       \                \
        // 2   1        2                 3
        let node3 = UniqueBinarySearchTreesII.TreeNode(1)
        node3.right = UniqueBinarySearchTreesII.TreeNode(3)
        node3.right?.left = UniqueBinarySearchTreesII.TreeNode(2)
        let node4 = UniqueBinarySearchTreesII.TreeNode(3)
        node4.left = UniqueBinarySearchTreesII.TreeNode(2)
        node4.left?.left = UniqueBinarySearchTreesII.TreeNode(1)
        let node5 = UniqueBinarySearchTreesII.TreeNode(3)
        node5.left = UniqueBinarySearchTreesII.TreeNode(1)
        node5.left?.right = UniqueBinarySearchTreesII.TreeNode(2)
        let node6 = UniqueBinarySearchTreesII.TreeNode(2)
        node6.left = UniqueBinarySearchTreesII.TreeNode(1)
        node6.right = UniqueBinarySearchTreesII.TreeNode(3)
        let node7 = UniqueBinarySearchTreesII.TreeNode(1)
        node7.right = UniqueBinarySearchTreesII.TreeNode(2)
        node7.right?.right = UniqueBinarySearchTreesII.TreeNode(3)
        let array2 = u.generateTrees(3)
        XCTAssertTrue(array2.count == 5)
        XCTAssertTrue(array2.contains {
            $0 == node3
        })
        XCTAssertTrue(array2.contains {
            $0 == node4
        })
        XCTAssertTrue(array2.contains {
            $0 == node5
        })
        XCTAssertTrue(array2.contains {
            $0 == node6
        })
        XCTAssertTrue(array2.contains {
            $0 == node7
        })
    }
    
}
