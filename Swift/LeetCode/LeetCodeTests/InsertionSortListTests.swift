//
//  InsertionSortListTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 01/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [InsertionSortList](./LeetCode/InsertionSortList.swift).
//

import XCTest
@testable import LeetCode

class InsertionSortListTests: XCTestCase {
    
    func testInsertionSortList() {
        let ist = InsertionSortList()
        XCTAssertNil(ist.insertionSortList(nil))
        
        XCTAssertEqual(ist.insertionSortList(InsertionSortList.ListNode(0)), InsertionSortList.ListNode(0))

        let node0 = InsertionSortList.ListNode(1)
        node0.next = InsertionSortList.ListNode(0)
        let node1 = InsertionSortList.ListNode(0)
        node1.next = InsertionSortList.ListNode(1)
        XCTAssertEqual(ist.insertionSortList(node0), node1)
    }
    
}
