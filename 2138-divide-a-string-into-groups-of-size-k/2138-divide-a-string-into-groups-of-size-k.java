class Solution {
    public String[] divideString(String s, int k, char fill) {

        int n = (s.length() + k - 1) / k;
        String[] arr = new String[n];

        int index = 0;

        for (int i = 0; i < s.length(); i += k) {

            String temp = "";

            for (int j = i; j < i + k; j++) {

                if (j < s.length()) {
                    temp += s.charAt(j);
                } else {
                    temp += fill;
                }
            }

            arr[index] = temp;
            index++;
        }

        return arr;
    }
}