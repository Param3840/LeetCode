import java.util.*;

class Solution { 
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        String[] phoneMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(0, digits, phoneMap, current, result);
        return result;
    }

    private void backtrack(int index, String digits, String[] phoneMap, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = phoneMap[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(index + 1, digits, phoneMap, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
