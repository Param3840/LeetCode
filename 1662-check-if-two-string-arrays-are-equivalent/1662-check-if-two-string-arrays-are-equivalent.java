class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1i = 0;
        int w2i = 0;
        int i = 0;
        int j = 0;

        while (w1i < word1.length && w2i < word2.length) {
            if (word1[w1i].charAt(i) != word2[w2i].charAt(j)) {
                return false;
            }
            i++;
            j++;

            if (i == word1[w1i].length()) {
                i = 0;
                w1i++;
            }
            if (j == word2[w2i].length()) {
                j = 0;
                w2i++;
            }
        }
        if (w1i == word1.length && w2i == word2.length) {
            return true;
        }
        return false;
    }
}