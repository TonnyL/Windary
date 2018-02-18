//
//  BinaryTreeLevelOrderTraversal.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 18/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//  For example:
//  Given binary tree [3,9,20,null,null,15,7],
//  3
//  / \
//  9 20
//  /\
//  15 7
//  return its level order traversal as:
//  [
//  [3],
//  [9,20],
//  [15,7]
//  ]
//
//  Accepted. See [BinaryTreeLevelOrderTraversalTests](./LeetCodeTests/BinaryTreeLevelOrderTraversal.swift) for test cases.
//

import Foundation

class BinaryTreeLevelOrderTraversal {
    
    func levelOrder(_ root: TreeNode?) -> [[Int]] {
        var lists = Array<Array<Int>>.init()
        self.helper(&lists, root, 0)
        return lists
    }
    
    private func helper(_ lists: inout [[Int]], _ node: TreeNode?, _ height: Int) {
        if node == nil {
            return
        }
        if height >= lists.count {
            lists.append([])
        }
        lists[height].append(node!.val)
        self.helper(&lists, node!.left, height + 1)
        self.helper(&lists, node!.right, height + 1)
    }
    
    public class TreeNode: Equatable {
        
        public var val: Int
        public var left: TreeNode?
        public var right: TreeNode?
        
        public init(_ val: Int) {
            self.val = val
            self.left = nil
            self.right = nil
        }
        
        public static func == (lhs: BinaryTreeLevelOrderTraversal.TreeNode, rhs: BinaryTreeLevelOrderTraversal.TreeNode) -> Bool {
            return lhs.val == rhs.val && lhs.left == rhs.left && lhs.right == rhs.right
        }
        
    }
    
}
