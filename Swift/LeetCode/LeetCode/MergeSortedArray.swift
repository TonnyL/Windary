//
//  MergeSortedArray.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//  Note:
//  You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
//  The number of elements initialized in nums1 and nums2 are m and n respectively.
//
//  Accepted. See [MergeSortedArrayTests](./LeetCodeTests/MergeSortedArrayTests.swift) for test cases.
//

import Foundation

class MergeSortedArray {
    
    func merge(_ nums1: inout [Int], _ m: Int, _ nums2: [Int], _ n: Int) {
        if n != 0 {
            nums1[m...(m + n - 1)] = nums2[0...(nums2.count - 1)]
            
            let array = Array(nums1[0...(m + n - 1)]).sorted()
            for i in array.indices {
                nums1[i] = array[i]
            }
        }
        // print(nums1)
    }
    
}
