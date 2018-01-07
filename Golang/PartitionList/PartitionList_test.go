package PartitionList

import (
	"testing"
	"reflect"
)

func TestPartition(t *testing.T) {

	if partition(nil, 2) == nil {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(partition(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
		},
	}, 3), &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(partition(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
		},
	}, 0), &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(partition(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 4,
			Next: &ListNode{
				Val: 3,
				Next: &ListNode{
					Val: 2,
					Next: &ListNode{
						Val: 5,
						Next: &ListNode{
							Val: 2,
						},
					},
				},
			},
		},
	}, 3), &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 2,
			Next: &ListNode{
				Val: 2,
				Next: &ListNode{
					Val: 4,
					Next: &ListNode{
						Val: 3,
						Next: &ListNode{
							Val: 5,
						},
					},
				},
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

	if reflect.DeepEqual(partition(&ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 4,
			Next: &ListNode{
				Val: 3,
				Next: &ListNode{
					Val: 2,
					Next: &ListNode{
						Val: 5,
						Next: &ListNode{
							Val: 2,
						},
					},
				},
			},
		},
	}, 4), &ListNode{
		Val: 1,
		Next: &ListNode{
			Val: 3,
			Next: &ListNode{
				Val: 2,
				Next: &ListNode{
					Val: 2,
					Next: &ListNode{
						Val: 4,
						Next: &ListNode{
							Val: 5,
						},
					},
				},
			},
		},
	}) {
		t.Log("pass")
	} else {
		t.Error("failed")
	}

}
