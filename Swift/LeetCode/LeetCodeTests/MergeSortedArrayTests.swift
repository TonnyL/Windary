//
//  MergeSortedArrayTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [MergeSortedArray](./LeetCode/MergeSortedArray.swift).
//

import XCTest
@testable import LeetCode

class MergeSortedArrayTests: XCTestCase {
    
    func testMerge() {
        let msa = MergeSortedArray()
        // Expected: [1]
        // msa.merge([1], 1, [], 0)
        // Expected: []
        // msa.merge([0], 0, [1], 1)
        // Expected: [1, 2, 3, 4, 5, 6]
        // msa.merge([4, 5, 6, 0, 0, 0], 3, [1, 2, 3], 3)
        // Expected: [0, 0, 0, 0, 1, 2, 3, 4, -1]
        // msa.merge([0, 0, 0, 1, 2, 3, -1, -1, -1], 6, [0, 4], 2)
        // Expected: [0, 1, 2, 3, 3, 4, 0, 0, 0]
        // msa.merge([0, 1, 2, 3, 0, 0, 0, 0, 0], 4, [3, 4, 0], 2)
        // Expected: [1, 1, 2, 0]
        // msa.merge([1, 2, 0, 0], 2, [1], 1)
        // Expected: [1, 2, 2, 3, 5, 6]
        // msa.merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3)
    }
    
}
