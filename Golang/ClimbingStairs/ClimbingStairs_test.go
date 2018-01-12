package ClimbingStairs

import "testing"

func TestClimbStairs(t *testing.T) {

	if climbStairs(1) == 1 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if climbStairs(3) == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if climbStairs(5) == 8 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
