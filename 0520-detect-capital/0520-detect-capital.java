class Solution {
    public boolean allCapital(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch < 'A' || ch > 'Z') {
                return false;
            }
        }
        return true;
    }

    public boolean allSmall(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch < 'a' || ch > 'z') {
                return false;
            }
        }
        return true;
    }

    public boolean detectCapitalUse(String word) {
        if (allCapital(word) || allSmall(word) || (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' &&
                allSmall(word.substring(1)))) {
            return true;
        }
        return false;
    }
}