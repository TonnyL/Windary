//
//  IntersectionOfTwoLinkedListsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 28/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//

import XCTest
@testable import LeetCode

class IntersectionOfTwoLinkedListsTests: XCTestCase {
    
    func testGetIntersectionNode() {
        let i = IntersectionOfTwoLinkedLists()
        
        XCTAssertNil(i.getIntersectionNode(nil, nil))
        
        let node345 = IntersectionOfTwoLinkedLists.ListNode(3)
        node345.next = IntersectionOfTwoLinkedLists.ListNode(4)
        node345.next?.next = IntersectionOfTwoLinkedLists.ListNode(5)
        
        XCTAssertNil(i.getIntersectionNode(node345, IntersectionOfTwoLinkedLists.ListNode(6)))
        
        let node12345 = IntersectionOfTwoLinkedLists.ListNode(1)
        node12345.next = IntersectionOfTwoLinkedLists.ListNode(2)
        node12345.next?.next = node345
        
        XCTAssertEqual(i.getIntersectionNode(node12345, node345), node345)
    }
    
}
