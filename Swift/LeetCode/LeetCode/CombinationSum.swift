//
//  CombinationSum.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 21/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a set of candidate numbers (C) (without duplicates) and a target number (T),
//  find all unique combinations in C where the candidate numbers sums to T.
//
//  The same repeated number may be chosen from C unlimited number of times.
//
//  Note:
//  All numbers (including target) will be positive integers.
//  The solution set must not contain duplicate combinations.
//  For example, given candidate set [2, 3, 6, 7] and target 7,
//  A solution set is:
//  [
//  [7],
//  [2, 2, 3]
//  ]
//
//  Accepted. See [CombinationSumTests](./LeetCodeTests/CombinationSumTests.swift) for test cases.
//

import Foundation

class CombinationSum {
    
    func combinationSum(_ candidates: [Int], _ target: Int) -> [[Int]] {
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
            path.append(candidates[i])
            dfs(candidates, target - candidates[i], &path, &ret, i)
            path.remove(at: path.count - 1)
        }
    }
    
}
