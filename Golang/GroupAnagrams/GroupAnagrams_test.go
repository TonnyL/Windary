package GroupAnagrams

import (
	"testing"
	"reflect"
)

func TestGroupAnagrams(t *testing.T) {

	if reflect.DeepEqual(groupAnagrams([]string{}),
		[][]string{}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if len(groupAnagrams([]string{"eat", "tea", "tan", "ate", "nat", "bat"})) == 3 {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
