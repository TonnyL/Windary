import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * <p>
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 * <p>
 * Accepted.
 */
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        String[] dict = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> results = new LinkedList<>();

        if (digits.length() == 0) {
            return Collections.emptyList();
        }

        if (digits.length() == 1) {
            for (char c : dict[Integer.valueOf(digits)].toCharArray()) {
                results.add(String.valueOf(c));
            }
            return results;
        }

        List<String> list = letterCombinations(digits.substring(1, digits.length()));
        StringBuilder sb = new StringBuilder();

        for (char c : dict[Integer.valueOf(digits.substring(0, 1))].toCharArray()) {
            for (String s : list) {
                sb.append(String.valueOf(c)).append(s);
                results.add(sb.toString());
                sb.setLength(0);
            }
        }

        return results;
    }

}
