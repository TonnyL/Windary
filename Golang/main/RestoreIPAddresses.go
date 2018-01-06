package main

//Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//
//For example:
//Given "25525511135",
//
//return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
//Accepted.

import (
	"strconv"
	"fmt"
)

func restoreIpAddresses(s string) []string {
	var results []string = nil

	if len(s) < 4 || len(s) > 12 {
		return results
	}

	for i := 1; i < 4; i++ {
		for j := 1; j < 4; j++ {
			for k := 1; k < 4; k++ {
				for m := 1; m < 4; m++ {
					if i+j+k+m == len(s) {
						a, _ := strconv.Atoi(s[0:i])
						b, _ := strconv.Atoi(s[i:i+j])
						c, _ := strconv.Atoi(s[i+j:i+j+k])
						d, _ := strconv.Atoi(s[i+j+k:i+j+k+m])
						if a <= 255 && b <= 255 && c <= 255 && d <= 255 {
							str := fmt.Sprintf("%d.%d.%d.%d", a, b, c, d)
							if len(str) == len(s)+3 {
								results = append(results, str)
							}
						}
					}
				}
			}
		}
	}

	return results
}
