//
//  UniqueBinarySearchTrees.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 28/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//
//  Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
//
//  For example,
//  Given n = 3, there are a total of 5 unique BST's.
//
//  1        3     3      2      1
//  \       /     /      / \      \
//  3      2     1      1   3      2
//  /     /      \                 \
//  2    1       2                 3
//
//  Accepted. See [UniqueBinarySearchTreesTests](./LeetCodeTests/UniqueBinarySearchTreesTests.swift) for test cases.
//

import Foundation

class UniqueBinarySearchTrees {
    
    // Recursive solution. Time limit exceeded.
//    func numTrees(_ n: Int) -> Int {
//        if n == 0 || n == 1 {
//            return 1
//        }
//
//        var r = 0
//        for i in 1...n {
//            r += numTrees(i - 1) * numTrees(n - i)
//        }
//
//        return r
//    }

    // Dynamic programming. Accepted.
    func numTrees(_ n: Int) -> Int {
        var array = Array<Int>.init(repeating: 0, count: n + 2)
        array[0] = 1
        array[1] = 1
        
        var i = 2
        while i < (n + 1) {
            for j in 0...(i - 1) {
                array[i] += array[j] * array[i - j - 1]
            }
            i += 1
        }
        
        return array[n]
    }
    
}
