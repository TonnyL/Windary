//
//  SameTree.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given two binary trees, write a function to check if they are equal or not.
//
//  Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
//
//  Accepted. See [SameTree](./LeetCodeTests/SameTreeTests.swift) for test cases.
//

import Foundation

class SameTree {
    
    func isSameTree(_ p: TreeNode?, _ q: TreeNode?) -> Bool {
        if p == nil && q == nil {
            return true
        }
        if p == nil || q == nil {
            return false
        }
        
        return p?.val == q?.val && isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }
    
    // Definition for a binary tree node.
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
