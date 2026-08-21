class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int first = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                if (first == 0) {
                    first = count[i];
                } else if (count[i] != first) {
                    return false;
                }
            }
        }

        return true;
    }
}