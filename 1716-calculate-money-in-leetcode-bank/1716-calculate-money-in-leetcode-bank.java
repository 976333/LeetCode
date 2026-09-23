class Solution {
    public int totalMoney(int n) {

        int sum = 0;
        int monday = 1;

        for (int i = 1; i <= n; i++) {

            sum = sum + monday;

            monday++;

            // After every 7 days, start next week
            if (i % 7 == 0) {
                monday = monday - 6;
            }
        }

        return sum;
    }
}