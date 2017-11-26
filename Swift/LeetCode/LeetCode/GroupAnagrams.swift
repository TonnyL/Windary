//
//  GroupAnagrams.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given an array of strings, group anagrams together.
//
//  For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
//  Return:
//
//  [
//  ["ate", "eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//  ]
//  Note: All inputs will be in lower-case.
//
//  Accepted. See [GroupAnagramsTests](./LeetCodeTests/GroupAnagramsTests.swift) for test cases.
//

import Foundation

class GroupAnagrams {
    
    func groupAnagrams(_ strs: [String]) -> [[String]] {
        var results: [[String]] = []
        if strs.isEmpty {
            return results
        }
        
        var map: [String: [String]] = [:]
        for s in strs {
            let chars = Array(s)
            let key = String(chars.sorted())
            if map[key] == nil {
                map[key] = []
            }
            map[key]?.append(s)
        }
        
        for array in map.values {
            results.append(array)
        }
        return results
    }
    
}
