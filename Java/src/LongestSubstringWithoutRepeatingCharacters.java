package io.github.tonnyl;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(ls.lengthOfLongestSubstring("pwwkewa"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        StringBuilder resultBuilder = new StringBuilder();
        StringBuilder tmpBuilder = new StringBuilder();
        char[] inputChars = s.toCharArray();

        resultBuilder.append(inputChars[0]);

        for (int i = 1; i < inputChars.length; i++) {
            if (tmpBuilder.toString().contains(String.valueOf(inputChars[i]))) {
                tmpBuilder.append(inputChars[i]);
            }
            if (resultBuilder.toString().contains(String.valueOf(inputChars[i]))) {
                tmpBuilder.delete(0, tmpBuilder.length());
                tmpBuilder.append(inputChars[i]);

                if (tmpBuilder.length() > resultBuilder.length()) {
                    resultBuilder.delete(0, resultBuilder.length());
                    resultBuilder.append(tmpBuilder.toString());
                    tmpBuilder.delete(0, tmpBuilder.length());
                }
            } else {
                resultBuilder.append(inputChars[i]);
            }
        }

        System.out.println(resultBuilder.toString());
        return resultBuilder.toString().length();
    }

}