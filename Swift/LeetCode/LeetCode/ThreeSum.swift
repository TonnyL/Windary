//
//  ThreeSum.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 03/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
//  Find all unique triplets in the array which gives the sum of zero.
//
//  Note: The solution set must not contain duplicate triplets.
//
//  For example, given array S = [-1, 0, 1, 2, -1, -4],
//
//  A solution set is:
//  [
//  [-1, 0, 1],
//  [-1, -1, 2]
//  ]
//
//  Accepted. See [ThreeSumTests](./LeetCodeTests/ThreeSumTests.swift) for test cases.
//

import Foundation

class ThreeSum {
    
    func threeSum(_ nums: [Int]) -> [[Int]] {
        let array = nums.sorted()
        
        var set = Set<Triple>.init()
        
        var first = 0
        while first < array.count - 2 {
            if array[first] > 0 {
                break
            }
            
            let target = 0 - array[first]
            var second = first + 1
            var third = array.count - 1
            
            while second < third {
                if array[second] + array[third] == target {
                    set.insert(Triple(array[first], array[second], array[third]))
                    while second < third && array[second] == array[second + 1] {
                        second += 1
                    }
                    while second < third && array[third] == array[third - 1] {
                        third -= 1
                    }
                    second += 1
                    third -= 1
                } else if array[second] + array[third] < target {
                    second += 1
                } else {
                    third -= 1
                }
            }
            
            first += 1
        }
        
        var lists = Array<Array<Int>>.init()
        set.forEach{
            lists.append([$0.a, $0.b, $0.c])
        }
        
        return lists
    }
 
    class Triple: Equatable, Hashable {
        
        var a: Int
        var b: Int
        var c: Int
        
        var hashValue: Int {
            var value = (-self.a) * 100
            value += abs(self.b) * 10
            value += c
            return value
        }
        
        init(_ a: Int, _ b: Int, _ c: Int) {
            self.a = a
            self.b = b
            self.c = c
        }
        
        static func ==(lhs: ThreeSum.Triple, rhs: ThreeSum.Triple) -> Bool {
            return lhs.a == rhs.a && lhs.b == rhs.b && lhs.c == rhs.c
        }
        
    }
}
