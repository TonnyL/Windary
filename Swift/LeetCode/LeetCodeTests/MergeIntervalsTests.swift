//
//  MergeIntervalsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 07/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//

import XCTest
@testable import LeetCode

class MergeIntervalsTests: XCTestCase {
    
    func testMerge() {
        let mi = MergeIntervals()
        
        // Expected: [1, 1]
        print(mi.merge([MergeIntervals.Interval(1, 1)]))
        
        // Expected: [1, 2]
        print(mi.merge([MergeIntervals.Interval(1, 2), MergeIntervals.Interval(2, 2)]))
        
        // Expected: [1, 2], [4, 5], [7, 8]
        print(mi.merge([MergeIntervals.Interval(1, 2), MergeIntervals.Interval(4, 5), MergeIntervals.Interval(7, 8)]))
        
        // Expected: [1, 4]
        print(mi.merge([MergeIntervals.Interval(1, 3), MergeIntervals.Interval(2, 4)]))
        
        // Expected: [1, 4]
        print(mi.merge([MergeIntervals.Interval(1, 4), MergeIntervals.Interval(2, 3)]))
    }
    
}
