package RestoreIPAddresses

import (
	"testing"
	"reflect"
)

func TestRestoreIpAddresses(t *testing.T) {

	if restoreIpAddresses("1") == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if restoreIpAddresses("111") == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if restoreIpAddresses("1111111111111") == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(restoreIpAddresses("1111"), []string{"1.1.1.1"}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(restoreIpAddresses("25525511135"), []string{"255.255.11.135", "255.255.111.35"}) {
		t.Log("pass")
	} else {
		t.Error("pass")
	}

}
