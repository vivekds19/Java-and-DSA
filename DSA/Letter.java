import java.util.*;

class Letter {

    static String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }

        backtrack("", digits, result);
        return result;
    }

    void backtrack(String path, String digits, List<String> result) {
        if (digits.isEmpty()) {
            result.add(path);
            return;
        }

        int digit = digits.charAt(0) - '0';
        String letters = map[digit];

        for (char ch : letters.toCharArray()) {
            backtrack(path + ch, digits.substring(1), result);
        }
    }
}
