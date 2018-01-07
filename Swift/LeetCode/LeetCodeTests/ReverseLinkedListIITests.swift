//
//  ReverseLinkedListIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 07/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [ReverseLinkedListII](./LeetCode/ReverseLinkedListII.swift).
//

import XCTest
@testable import LeetCode

class ReverseLinkedListIITests: XCTestCase {
    
    func testReverseBetween() {
        let r = ReverseLinkedListII()
        
        // Expected: null
        print(r.reverseBetween(nil, 1, 2))
        
        var node123 = ReverseLinkedListII.ListNode(1)
        node123.next = ReverseLinkedListII.ListNode(2)
        node123.next?.next = ReverseLinkedListII.ListNode(3)
        // Expected: 1 -> 3 -> 2
        print(r.reverseBetween(node123, 2, 3))
        
        // Expected: 1
        print(r.reverseBetween(ReverseLinkedListII.ListNode(1), 1, 1))
        
        var node12 = ReverseLinkedListII.ListNode(1)
        node12.next = ReverseLinkedListII.ListNode(2)
        // Expected: 2 -> 1
        print(r.reverseBetween(node12, 1, 2))
        
        var node12345 = ReverseLinkedListII.ListNode(1)
        node12345.next = ReverseLinkedListII.ListNode(2)
        node12345.next?.next = ReverseLinkedListII.ListNode(3)
        node12345.next?.next?.next = ReverseLinkedListII.ListNode(4)
        node12345.next?.next?.next?.next = ReverseLinkedListII.ListNode(5)
        // Expected: 1 -> 4 -> 3 -> 2 -> 5
        print(r.reverseBetween(node12345, 2, 4))
    }
    
}
