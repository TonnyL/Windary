package ZigZagConversion

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
//like this: (you may want to display this pattern in a fixed font for better legibility)
//<p>
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//<p>
//string convert(string text, int nRows);
//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
//Accepted.

func convert(s string, numRows int) string {
	if len(s) < 2 || numRows <= 1 {
		return s
	}

	str := ""
	for i := 0; i < numRows; i++ {
		for j, index := 0, i; index < len(s); index = (2*numRows-2)*j + i {
			str += string(s[index])
			if i != 0 && i != numRows-1 && index+(numRows-i-1)*2 < len(s) {
				str += string(s[index+(numRows-i-1)*2])
			}
			j++
		}
	}

	return str
}
