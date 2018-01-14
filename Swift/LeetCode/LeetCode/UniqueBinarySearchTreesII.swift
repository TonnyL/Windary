//
//  UniqueBinarySearchTreesII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 14/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//
//  Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
//
//  For example,
//  Given n = 3, your program should return all 5 unique BST's shown below.
//
//  1       3     3      2      1
//  \      /     /      / \      \
//  3     2     1      1  3      2
//  /    /       \                \
//  2   1        2                 3
//
//  Accepted. See [UniqueBinarySearchTreesIITests](./LeetCodeTests/UniqueBinarySearchTreesIITests.swift) for test cases.
//

import Foundation

class UniqueBinarySearchTreesII {
    
    func generateTrees(_ n: Int) -> [TreeNode?] {
        if n <= 0 {
            return []
        }
        return gen(1, n)
    }
    
    func gen(_ start: Int, _ end: Int) -> [TreeNode?] {
        var list = Array<TreeNode?>.init()
        if start > end {
            list.append(nil)
            return list
        }
        if start == end {
            list.append(TreeNode(start))
            return list
        }
        
        for i in start...end {
            for m in gen(start, i - 1) {
                for n in gen(i + 1, end) {
                    let root = TreeNode(i)
                    root.left = m
                    root.right = n
                    list.append(root)
                }
            }
        }
        
        return list
    }
    
    public class TreeNode: CustomStringConvertible  {
        public var val: Int
        public var left: TreeNode?
        public var right: TreeNode?
        public init(_ val: Int) {
            self.val = val
            self.left = nil
            self.right = nil
        }
        
        public var description: String {
            return "ListNode val: \(self.val) left: \(String(describing: self.left)) right: \(String(describing: self.right))"
        }
    }
    
}
