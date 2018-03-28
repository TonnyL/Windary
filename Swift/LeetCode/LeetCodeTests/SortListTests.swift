//
//  SortListTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 16/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [SortList](./LeetCode/SortList.swift).
//

import XCTest
@testable import LeetCode

class SortListTests: XCTestCase {
    
    func testSortList() {
        let sl = SortList()
        
        XCTAssertNil(sl.sortList(nil))
        
        XCTAssertEqual(SortList.ListNode(0), sl.sortList(SortList.ListNode(0)))
        
        let node1 = SortList.ListNode(1)
        node1.next = SortList.ListNode(0)
        
        let node2 = SortList.ListNode(0)
        node2.next = SortList.ListNode(1)
        
        XCTAssertEqual(node2, sl.sortList(node1))
        
        let node3 = SortList.ListNode(0)
        node3.next = SortList.ListNode(1)
        XCTAssertEqual(node3, sl.sortList(node2))
        
    }
    
}
