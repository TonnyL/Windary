//
//  SwapNodesInPairsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 03/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [SwapNodesInPairs](./LeetCode/SwapNodesInPairs.swift).
//

import XCTest
@testable import LeetCode

class SwapNodesInPairsTests: XCTestCase {
    
    func testSwapPairs() {
        let s = SwapNodesInPairs()
        
        // Expected: nil
        print(s.swapPairs(nil))
        
        // Expected: 1
        print(s.swapPairs(SwapNodesInPairs.ListNode(1)))
        
        // Expected: 2 -> 1
        var node12 = SwapNodesInPairs.ListNode(1)
        node12.next = SwapNodesInPairs.ListNode(2)
        print(s.swapPairs(node12))
        
        // Expected: 2 -> 1 -> 4 -> 3
        var node1234 = SwapNodesInPairs.ListNode(1)
        node1234.next = SwapNodesInPairs.ListNode(2)
        node1234.next?.next = SwapNodesInPairs.ListNode(3)
        node1234.next?.next?.next = SwapNodesInPairs.ListNode(4)
        print(s.swapPairs(node1234))
        
        // Expected: 2 -> 1 -> 4 -> 3 -> 5
        var node12345 = SwapNodesInPairs.ListNode(1)
        node12345.next = SwapNodesInPairs.ListNode(2)
        node12345.next?.next = SwapNodesInPairs.ListNode(3)
        node12345.next?.next?.next = SwapNodesInPairs.ListNode(4)
        node12345.next?.next?.next?.next = SwapNodesInPairs.ListNode(5)
        print(s.swapPairs(node12345))
    }
    
}
