package MergeIntervals

import (
	"testing"
	"reflect"
)

func TestMerge(t *testing.T) {

	if reflect.DeepEqual(merge([]Interval{{
		Start: 1,
		End:   1,
	}}), []Interval{{
		Start: 1,
		End:   1,
	}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(merge([]Interval{{
		Start: 1,
		End:   2,
	}, {
		Start: 2,
		End:   2,
	}}), []Interval{{
		Start: 1,
		End:   2,
	}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(merge([]Interval{{
		Start: 1,
		End:   2,
	}, {
		Start: 4,
		End:   5,
	}, {
		Start: 7,
		End:   8,
	}}), []Interval{{
		Start: 1,
		End:   2,
	}, {
		Start: 4,
		End:   5,
	}, {
		Start: 7,
		End:   8,
	}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(merge([]Interval{{
		Start: 1,
		End:   3,
	}, {
		Start: 2,
		End:   4,
	}}), []Interval{{
		Start: 1,
		End:   4,
	}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(merge([]Interval{{
		Start: 1,
		End:   4,
	}, {
		Start: 2,
		End:   3,
	}}), []Interval{{
		Start: 1,
		End:   4,
	}}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
