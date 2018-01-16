package LongestPalindromicSubstring

func longestPalindrome(s string) string {
	array := []byte(s)
	arrayLength := len(array)
	if arrayLength <= 1 {
		return s
	}

	var maxLength = 0
	var startIndex = 0

	for index := 0; index < arrayLength; index++ {
		var leftIndex = index
		var rightIndex = index
		for ; leftIndex >= 0 && rightIndex < arrayLength && array[leftIndex] == array[rightIndex]; {
			current := rightIndex - leftIndex + 1
			if current > maxLength {
				maxLength = current
				startIndex = leftIndex
			}
			leftIndex -= 1
			rightIndex += 1
		}

		leftIndex = index
		rightIndex = index + 1
		for ; leftIndex >= 0 && rightIndex < arrayLength && array[leftIndex] == array[rightIndex]; {
			current := rightIndex - leftIndex + 1
			if current > maxLength {
				maxLength = current
				startIndex = leftIndex
			}
			leftIndex -= 1
			rightIndex += 1
		}
	}

	return string(array[startIndex:startIndex+maxLength])
}
