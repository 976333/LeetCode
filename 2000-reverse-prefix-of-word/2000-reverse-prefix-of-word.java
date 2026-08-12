class Solution {
    public String reversePrefix(String word, char ch) {

        int index = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return word;
        }

        String res = "";

        // Reverse prefix including ch
        for (int i = index; i >= 0; i--) {
            res += word.charAt(i);
        }

        // Add remaining characters
        for (int i = index + 1; i < word.length(); i++) {
            res += word.charAt(i);
        }

        return res;
    }
}