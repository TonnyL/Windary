//
//  ValidateBinarySearchTree.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 11/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a binary tree, determine if it is a valid binary search tree (BST).
//
//  Assume a BST is defined as follows:
//
//  The left subtree of a node contains only nodes with keys less than the node's key.
//  The right subtree of a node contains only nodes with keys greater than the node's key.
//  Both the left and right subtrees must also be binary search trees.
//  Example 1:
//   2
//  / \
//  1   3
//  Binary tree [2,1,3], return true.
//  Example 2:
//   1
//  / \
//  2   3
//  Binary tree [1,2,3], return false.
//
//  Accepted. See [ValidateBinarySearchTreeTests](./LeetCodeTests/ValidateBinarySearchTreeTests.swift) for test cases.
//

import Foundation

class ValidateBinarySearchTree {
    
    func isValidBST(_ root: TreeNode?) -> Bool {
        var node = root
        if node == nil {
            return true
        }
        
        var stack = Array<TreeNode?>.init()
        var pre: TreeNode? = nil
        while node != nil || !stack.isEmpty {
            while (node != nil) {
                stack.append(node)
                node = node?.left
            }
            node = stack[stack.count - 1]
            stack.remove(at: stack.count - 1)
            if (pre != nil && node!.val <= pre!.val) {
                return false
            }
            pre = node
            node = node?.right
        }
        
        return true
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
