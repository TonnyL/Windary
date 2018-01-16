package SimplifyPath

import "testing"

func TestSimplifyPath(t *testing.T) {

	if simplifyPath("/home/") == "/home" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if simplifyPath("/a/./b/../../c/") == "/c" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if simplifyPath("/../") == "/" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if simplifyPath("/home//foo/") == "/home/foo" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if simplifyPath("/a/b/c") == "/a/b/c" {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
