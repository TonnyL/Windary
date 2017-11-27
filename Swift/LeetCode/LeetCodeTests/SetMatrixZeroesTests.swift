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
        
        // s.setZeroes([])
        // The matrix:
        // [
        //   [0, 0]
        // ]
        // s.setZeroes([[0, 1]])
        // The matrix:
        // [
        //   [0, 0, 0],
        //   [3, 0, 5],
        //   [6, 0, 8]
        // ]
        // s.setZeroes([[1, 0, 2], [3, 4, 5], [6, 7, 8]])
        // The matrix:
        // [
        //   [0, 0, 0],
        //   [0, 0, 0],
        //   [0, 0, 0]
        // ]
        // s.setZeroes([[0, 1, 1], [2, 0, 2], [3, 3, 0]])
        // The matrix:
        // [
        //   [0, 0, 0, 0],
        //   [0, 0, 0, 4],
        //   [0, 0, 0, 0],
        //   [0, 0, 0, 3],
        //   [0, 0, 0, 0]
        // ]
        // s.setZeroes([[0, 0, 0, 5], [4, 3, 1, 4], [0, 1, 1, 4], [1, 2, 1, 3], [0, 0, 1, 1]])
    }
    
}
