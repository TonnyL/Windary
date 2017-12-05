import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 * <p>
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 * <p>
 * [
 * ["ate", "eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note: All inputs will be in lower-case.
 * <p>
 * Accepted.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();

        if (strs.length == 0) return results;

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }

        results.addAll(map.values());
        return results;
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();

        // Expected:
        // [
        //  []
        // ]
        System.out.println(ga.groupAnagrams(new String[]{}));

        // Expected:
        // [
        //  ["ate", "eat","tea"],
        //  ["nat","tan"],
        //  ["bat"]
        // ]
        System.out.println(ga.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

}
