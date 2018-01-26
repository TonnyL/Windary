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
        
        XCTAssertTrue(mi.merge([MergeIntervals.Interval(1, 1)]) == [MergeIntervals.Interval(1, 1)])
        
        XCTAssertTrue(mi.merge([MergeIntervals.Interval(1, 2), MergeIntervals.Interval(2, 2)]) == [MergeIntervals.Interval(1, 2)])
        
        XCTAssertTrue(mi.merge([MergeIntervals.Interval(1, 2), MergeIntervals.Interval(4, 5), MergeIntervals.Interval(7, 8)]) == [MergeIntervals.Interval(1, 2), MergeIntervals.Interval(4, 5), MergeIntervals.Interval(7, 8)])
        
        XCTAssertTrue(mi.merge([MergeIntervals.Interval(1, 3), MergeIntervals.Interval(2, 4)]) == [MergeIntervals.Interval(1, 4)])
        
        XCTAssertTrue(mi.merge([MergeIntervals.Interval(1, 4), MergeIntervals.Interval(2, 3)]) == [MergeIntervals.Interval(1, 4)])
    }
    
}
