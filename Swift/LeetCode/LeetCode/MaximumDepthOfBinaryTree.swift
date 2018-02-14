//
//  MaximumDepthOfBinaryTree.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 14/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a binary tree, find its maximum depth.
//
//  The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//  For example:
//  Given binary tree [3,9,20,null,null,15,7],
//
//    3
//   / \
//  9 20
//   / \
//   15 7
//
//  return its depth = 3.
//
//  Accepted. See [MaximumDepthOfBinaryTreeTests](./LeetCodeTests/MaximumDepthOfBinaryTreeTests.swift) for test cases.
//

import Foundation

class MaximumDepthOfBinaryTree {
    
    func maxDepth(_ root: TreeNode?) -> Int {
        let maxDepth = 0
        if root == nil {
            return maxDepth
        }
        return max(self.maxDepth(_:root?.left), self.maxDepth(_:root?.right)) + 1
    }
    
    public class TreeNode {
        
        public var val: Int
        public var left: TreeNode?
        public var right: TreeNode?
        
        public init(_ val: Int) {
            self.val = val
            self.left = nil
            self.right = nil
        }
        
    }
    
}
