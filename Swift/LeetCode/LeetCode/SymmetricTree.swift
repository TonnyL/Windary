//
//  SymmetricTree.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 15/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//  For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//  1
//  / \
//  2   2
//  / \ / \
//  3  4 4  3
//  But the following [1,2,2,null,3,null,3] is not:
//  1
//  / \
//  2   2
//  \   \
//  3    3
//  Note:
//  Bonus points if you could solve it both recursively and iteratively.
//
//  Accepted. See [SymmetricTreeTests](./LeetCodeTests/SymmetricTreeTests.swift) for test cases.
//

import Foundation

class SymmetricTree {
    
    func isSymmetric(_ root: TreeNode?) -> Bool {
        return isMirror(root, root)
    }
    
    func isMirror(_ node1: TreeNode?, _ node2: TreeNode?) -> Bool {
        return node1 == nil && node2 == nil || node1 != nil && node2 != nil && (node1!.val == node2!.val) && isMirror(node1!.right, node2!.left) && isMirror(node1!.left, node2!.right)
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
