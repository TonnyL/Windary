package SimplifyPath

import "strings"

//Given an absolute path for a file (Unix-style), simplify it.
//
//For example,
//path = "/home/", => "/home"
//path = "/a/./b/../../c/", => "/c"
//
//Corner Cases:
//Did you consider the case where path = "/../"?
//In this case, you should return "/".
//Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
//In this case, you should ignore redundant slashes and return "/home/foo".
//
//Accepted.

func simplifyPath(path string) string {
	pathLength := len(path)
	if pathLength == 0 {
		return path
	}

	strs, results := strings.Split(path, "/"), make([]string, 0)
	for _, s := range strs {
		if s == ".." {
			if len(results) != 0 {
				results = append(results[:len(results)-1], results[len(results):]...)
			}
		} else if (s != ".") && len(s) != 0 {
			results = append(results, s)
		}
	}

	if len(results) == 0 {
		return "/"
	}

	s := ""
	for i := 0; i < len(results); i++ {
		s += "/"
		s += results[i]
	}

	return s
}
