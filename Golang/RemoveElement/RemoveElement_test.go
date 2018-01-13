package RemoveElement

import "testing"

func TestRemoveElement(t *testing.T) {

	//Expected:
	//nums: [2, 2, 3, 3] length = 2
	if removeElement([]int{3, 2, 2, 3}, 3) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	//Expected:
	//nums: [3, 3] length = 0
	if removeElement([]int{3, 3}, 3) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	//Expeted:
	//nums: [] length = 0
	if removeElement([]int{}, 0) == 0 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	//Expected:
	//nums: [3, 4, 5, 888, 2, 2] length = 4
	if removeElement([]int{2, 3, 4, 5, 888, 2}, 2) == 4 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	//Expected:
	//nums: [3, 3] length = 2
	if removeElement([]int{3, 3}, 0) == 2 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
