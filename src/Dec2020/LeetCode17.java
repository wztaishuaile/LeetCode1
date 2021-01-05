package Dec2020;

import java.util.ArrayList;
import java.util.List;

/**
 * 数组
 */
public class LeetCode17 {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        help(new StringBuilder(), combinations, digits);
        return combinations;
    }

    public void help(StringBuilder prefix, List<String> combinations, final String digits) {
        if (prefix.length() == digits.length()) {
            combinations.add(prefix.toString());
            return;
        }
        int curDigits = digits.charAt(prefix.length()) - '0';
        String letters = KEYS[curDigits];
        for (char c : letters.toCharArray()) {
            prefix.append(c);  //添加
            help(prefix, combinations, digits);
            prefix.deleteCharAt(prefix.length() - 1);  //删除
        }
    }
}
