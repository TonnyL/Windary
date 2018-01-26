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
        
        var array0 = [1]
        msa.merge(&array0, 1, [], 0)
        XCTAssertTrue(array0 == [1])
        
        var array1 = [0]
        msa.merge(&array1, 0, [1], 1)
        XCTAssertTrue(array1 == [1])
        
        var array2 = [4, 5, 6, 0, 0, 0]
        msa.merge(&array2, 3, [1, 2, 3], 3)
        XCTAssertTrue(array2 == [1, 2, 3, 4, 5, 6])
        
        var array3 = [0, 0, 0, 1, 2, 3, -1, -1, -1]
        msa.merge(&array3, 6, [0, 4], 2)
        XCTAssertTrue(array3 == [0, 0, 0, 0, 1, 2, 3, 4, -1])
        
        var array4 = [0, 1, 2, 3, 0, 0, 0, 0, 0]
        msa.merge(&array4, 4, [3, 4, 0], 2)
        XCTAssertTrue(array4 == [0, 1, 2, 3, 3, 4, 0, 0, 0, 0])
        
        var array5 = [1, 2, 0, 0]
        msa.merge(&array5, 2, [1], 1)
        XCTAssertTrue(array5 == [1, 1, 2, 0])
        
        var array6 = [1, 2, 3, 0, 0, 0]
        msa.merge(&array6, 3, [2, 5, 6], 3)
        XCTAssertTrue(array6 == [1, 2, 2, 3, 5, 6])
    }
    
}
