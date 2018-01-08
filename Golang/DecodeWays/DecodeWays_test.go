package DecodeWays

import "testing"

func TestNumDecodings(t *testing.T) {

	if numDecodings("1") == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("0") == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("101") == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("110") == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("1010") == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("012") == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("1011") == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("12") == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("123") == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if numDecodings("12120") == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
