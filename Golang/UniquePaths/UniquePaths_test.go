package UniquePaths

import "testing"

func TestUniquePaths(t *testing.T) {

	if uniquePaths(1, 1) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if uniquePaths(1, 2) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// The matrix:
	// 1 1
	// 1 2(result)
	if uniquePaths(2, 2) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// The matrix:
	// 1 1 1 1
	// 1 2 3 4
	// 1 3 6 10
	// 1 4 10 20(result)
	if uniquePaths(4, 4) == 20 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
