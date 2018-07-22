package ReverseBits

import "testing"

func TestReverseBits(t *testing.T) {

	if reverseBits(0) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reverseBits(964176192) == 43261596 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
