package PascalsTriangle

//Given numRows, generate the first numRows of Pascal's triangle.
//
//For example, given numRows = 5,
//Return
//
//[
//[1],
//[1,1],
//[1,2,1],
//[1,3,3,1],
//[1,4,6,4,1]
//]
//
//Accepted.

func generate(numRows int) [][]int {
	var results [][]int
	if numRows == 0 {
		return results
	}
	if numRows == 1 {
		results = append(results, []int{1})
		return results
	}
	if numRows == 2 {
		results = append(results, []int{1})
		results = append(results, []int{1, 1})
		return results
	}

	tmp := generate(numRows - 1)
	var list []int

	last := tmp[len(tmp)-1]
	list = append(list, 1)
	for i := 1; i < len(last); i++ {
		list = append(list, last[i-1]+last[i])
	}
	list = append(list, 1)
	tmp = append(tmp, list)

	return tmp
}
