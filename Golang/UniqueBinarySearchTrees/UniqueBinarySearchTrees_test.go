package UniqueBinarySearchTrees

import "testing"

func TestNumTrees(t *testing.T) {

	if numTrees(0) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numTrees(1) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numTrees(2) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numTrees(3) == 5 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numTrees(4) == 14 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
