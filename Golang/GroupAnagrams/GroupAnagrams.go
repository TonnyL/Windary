package GroupAnagrams

import (
	"strconv"
	"sort"
)

//Given an array of strings, group anagrams together.
//
//For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
//Return:
//
//[
//["ate", "eat","tea"],
//["nat","tan"],
//["bat"]
//]
//Note: All inputs will be in lower-case.
//
//Accepted.

func groupAnagrams(strs []string) [][]string {
	results := make([][]string, 0)
	strsLength := len(strs)
	if strsLength == 0 {
		return results
	}

	dict := map[string][]string{}

	for _, s := range strs {
		chars := []byte(s)
		ints := make([]int, len(chars))
		for _, ch := range chars {
			ints = append(ints, int(ch))
		}

		sort.Ints(ints)

		key := ""
		for _, i := range ints {
			key += strconv.Itoa(i)
		}

		if _, ok := dict[key]; !ok {
			dict[key] = make([]string, 0)
		}

		dict[key] = append(dict[key], s)
	}

	for _, v := range dict {
		results = append(results, v)
	}

	return results
}
