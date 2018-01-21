//
//  CombinationSumII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 21/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a collection of candidate numbers (C) and a target number (T),
//  find all unique combinations in C where the candidate numbers sums to T.
//
//  Each number in C may only be used once in the combination.
//
//  Note:
//  All numbers (including target) will be positive integers.
//  The solution set must not contain duplicate combinations.
//  For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
//  A solution set is:
//  [
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
//  ]
//
//  Accepted. See [CombinationSumII](./LeetCodeTests/CombinationSumIITests.swift) for test cases.
//

import Foundation

class CombinationSumII {
    
    func combinationSum2(_ candidates: [Int], _ target: Int) -> [[Int]] {
        if candidates.isEmpty {
            return []
        }
        var lists = Array<Array<Int>>.init()
        
        let newCandidates = candidates.sorted()
        
        var path = Array<Int>.init()
        dfs(newCandidates, target, &path, &lists, 0)
        
        return lists
    }
    
    func dfs(_ candidates: [Int], _ target: Int, _ path: inout [Int], _ ret: inout [[Int]], _ index: Int) {
        if target < 0 {
            return
        }
        
        if target == 0 {
            ret.append(Array<Int>.init(path))
            return
        }
        
        for i in index..<candidates.count {
            if i != index && candidates[i] == candidates[i - 1] {
                continue
            }
            path.append(candidates[i])
            dfs(candidates, target - candidates[i], &path, &ret, i + 1)
            path.remove(at: path.count - 1)
        }
    }
    
}
