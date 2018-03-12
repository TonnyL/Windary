//
//  PathSum.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 12/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//  For example:
//  Given the below binary tree and sum = 22,
//
//  5
//  / \
//  4  8
//  /  / \
//  11 13 4
//  /  \   \
//  7  2   1
//  return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
//
//  Accepted. See [PathSumTests](./LeetCodeTests/PathSumTests.swift) for test cases.
//

import Foundation

class PathSum {
    
    func hasPathSum(_ root: TreeNode?, _ sum: Int) -> Bool {
        return root != nil && (root?.left == nil && root?.right == nil && sum == root!.val || hasPathSum(root?.left, sum - root!.val) || hasPathSum(root?.right, sum - root!.val))
    }
    
    public class TreeNode: Equatable  {
        
        public var val: Int
        public var left: TreeNode?
        public var right: TreeNode?
        
        public init(_ val: Int) {
            self.val = val
            self.left = nil
            self.right = nil
        }
        
        public static func ==(lhs: PathSum.TreeNode, rhs: PathSum.TreeNode) -> Bool {
            return lhs.val == rhs.val && lhs.left == rhs.left && lhs.right == rhs.right
        }
        
    }
    
}
