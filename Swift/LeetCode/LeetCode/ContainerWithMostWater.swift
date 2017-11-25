//
//  ContainerWithMostWater.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
//  n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
//   Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//  Note: You may not slant the container and n is at least 2.
//
//  Accepted. See [ContainerWithMostWaterTests](./LeetCodeTests/ContainerWithMostWater.swift) for the test cases.
//

import Foundation

class ContainerWithMostWater {
    
    func maxArea(_ height: [Int]) -> Int {
        if height.count < 2 {
            return 0
        }
        var low = 0
        var high = height.count - 1
        var maxCapacity = 0
        
        while low < high {
            let cap = (high - low) * min(height[low], height[high])
            if cap > maxCapacity {
                maxCapacity = cap
            }
            if height[low] < height[high] {
                low += 1
            } else {
                high -= 1
            }
        }
        return maxCapacity
    }
    
}
