//
//  TransposeMatrixTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 2018/12/9.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [TransposeMatrix](./LeetCode/TransposeMatrix.swift).
//

import XCTest
@testable import LeetCode

class TransposeMatrixTests: XCTestCase {

    func testTranspose() {
        let tm = TransposeMatrix()
        
        XCTAssertEqual(tm.transpose([[1, 1]]), [[1], [1]])
        
        XCTAssertEqual(tm.transpose([[1], [1]]), [[1, 1]])
        
        XCTAssertEqual(tm.transpose([[1, 2, 3], [4, 5, 6], [7, 8, 9]]), [[1, 4, 7], [2, 5, 8], [3, 6, 9]])
        
        XCTAssertEqual(tm.transpose([[1, 2, 3], [4, 5, 6]]), [[1, 4], [2, 5], [3, 6]])
    }

}
