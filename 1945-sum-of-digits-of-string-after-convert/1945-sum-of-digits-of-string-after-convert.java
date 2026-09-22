class Solution {
    public int getLucky(String s, int k) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            int n = s.charAt(i) - 'a' + 1;

            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
        }
        for (int i = 1; i < k; i++) {

            int temp = sum;
            sum = 0;

            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
        }

        return sum;
    }
}