package WordSearch

import "testing"

func TestExist(t *testing.T) {

	if exist([][]byte{{}}, "AB") == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	chars := [][]byte{
		{'A', 'B', 'C', 'E'},
		{'S', 'F', 'C', 'S'},
		{'A', 'D', 'E', 'E'}}

	if exist(chars, "ABCCED") {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if exist(chars, "SEE") {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if exist(chars, "ABCB") == false {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
