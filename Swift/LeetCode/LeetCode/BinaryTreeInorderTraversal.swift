//
//  BinaryTreeInorderTraversal.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 28/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a binary tree, return the inorder traversal of its nodes' values.
//
//  For example:
//  Given binary tree [1,null,2,3],
//  1
//  \
//  2
//  /
//  3
//  return [1,3,2].
//
//  Note: Recursive solution is trivial, could you do it iteratively?
//
//  Accepted. See [BinaryTreeInorderTraversalTests](./LeetCodeTests/BinaryTreeInorderTraversalTests.swift) for test cases.
//

import Foundation

class BinaryTreeInorderTraversal {
    
//    Recursive solution.
//    func inorderTraversal(_ root: TreeNode?) -> [Int] {
//        var list: [Int] = []
//        if root == nil {
//            return list
//        }
//
//        if root?.left != nil {
//            inorderTraversal(root?.left).forEach{ list.append($0) }
//        }
//
//        list.append((root?.val)!)
//
//        if root?.right != nil {
//            inorderTraversal(root?.right).forEach{ list.append($0) }
//        }
//
//        return list
//    }
    
    // Iterative solution.
    func inorderTraversal(_ root: TreeNode?) -> [Int] {
        var list: [Int] = []
        if root == nil {
            return list
        }
        
        var node = root
        var stack: [TreeNode?] = []
        while node != nil || !stack.isEmpty {
            while node != nil {
                stack.append(node)
                node = node?.left
            }
            
            node = stack[stack.count - 1]
            stack.remove(at: (stack.count - 1))
            list.append((node?.val)!)
            node = node?.right
        }
        
        return list
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
        
        public static func ==(lhs: BinaryTreeInorderTraversal.TreeNode, rhs: BinaryTreeInorderTraversal.TreeNode) -> Bool {
            return lhs.val == rhs.val && lhs.left == rhs.left && lhs.right == rhs.right
        }
        
    }
    
}
