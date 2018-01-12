package UniquePathsII

import "testing"

func TestUniquePathsWithObstacles(t *testing.T) {

	if uniquePathsWithObstacles([][]int{{0, 0, 0}}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if uniquePathsWithObstacles([][]int{{0, 1, 0}}) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if uniquePathsWithObstacles([][]int{{1}, {0}}) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if uniquePathsWithObstacles([][]int{{0}, {1}}) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if uniquePathsWithObstacles([][]int{{0, 0}, {1, 1}, {0, 0}}) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if uniquePathsWithObstacles([][]int{{0}, {0}}) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// 1 1 1
	// 1 0 1
	// 1 1 2
	if uniquePathsWithObstacles([][]int{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	// 1 1 1 1
	// 1 0 1 2
	// 1 1 2 4
	// 1 2 4 8
	if uniquePathsWithObstacles([][]int{{0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}) == 8 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
