//
//  SetMatrixZeroesTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SetMatrixZeroes](./LeetCode/SetMatrixZeroes.swift).
//

import XCTest
@testable import LeetCode

class SetMatrixZeroesTests: XCTestCase {
    
    func testSetZeroes() {
        let s = SetMatrixZeroes()
        
        var matrixEmpty: [[Int]] = []
        s.setZeroes(&matrixEmpty)
        XCTAssertTrue(matrixEmpty.isEmpty)
        
        var matrix0 = [[0, 1]]
        s.setZeroes(&matrix0)
        XCTAssertTrue(matrix0.count == 1)
        XCTAssertTrue(matrix0[0] == [0, 0])
        
        var matrix1 = [[1, 0, 2], [3, 4, 5], [6, 7, 8]]
        s.setZeroes(&matrix1)
        XCTAssertTrue(matrix1.count == 3)
        XCTAssertTrue(matrix1[0] == [0, 0, 0])
        XCTAssertTrue(matrix1[1] == [3, 0, 5])
        XCTAssertTrue(matrix1[2] == [6, 0, 8])
        
        var matrix2 = [[0, 1, 1], [2, 0, 2], [3, 3, 0]]
        s.setZeroes(&matrix2)
        XCTAssertTrue(matrix2.count == 3)
        XCTAssertTrue(matrix2[0] == [0, 0, 0])
        XCTAssertTrue(matrix2[1] == [0, 0, 0])
        XCTAssertTrue(matrix2[2] == [0, 0, 0])
        
        var matrix3 = [[0, 0, 0, 5], [4, 3, 1, 4], [0, 1, 1, 4], [1, 2, 1, 3], [0, 0, 1, 1]]
        s.setZeroes(&matrix3)
        XCTAssertTrue(matrix3.count == 5)
        XCTAssertTrue(matrix3[0] == [0, 0, 0, 0])
        XCTAssertTrue(matrix3[1] == [0, 0, 0, 4])
        XCTAssertTrue(matrix3[2] == [0, 0, 0, 0])
        XCTAssertTrue(matrix3[3] == [0, 0, 0, 3])
        XCTAssertTrue(matrix3[4] == [0, 0, 0, 0])
    }
    
}
