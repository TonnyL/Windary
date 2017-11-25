//
//  PalindromeNumber.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Determine whether an integer is a palindrome. Do this without extra space.
//
//  Some hints:
//  Could negative integers be palindromes? (ie, -1)
//  If you are thinking of converting the integer to string, note the restriction of using extra space.
//  You could also try reversing an integer. However, if you have solved the problem "Reverse Integer",
//  you know that the reversed integer might overflow. How would you handle such case?
//  There is a more generic way of solving this problem.
//
//  Accepted. See [PalindromeNumberTests](./LeetCode/PalindromeNumberTests.swift) for the test cases.
// 

import Foundation

class PalindromeNumber {
    
    func isPalindrome(_ x: Int) -> Bool {
        var num = x
        if [0, 1, 2, 3, 4, 5, 6, 7, 8, 9].contains(num) {
            return true
        }
        if (num % 10) == 0 {
            return false
        }
        
        var y = 0
        while num > y {
            y = y * 10 + num % 10
            num /= 10
        }
        
        return (num == y) || (num == y / 10)
    }
    
}
