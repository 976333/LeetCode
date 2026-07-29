class Solution {
    public int[] shuffle(int[] nums, int n) {

        for (int i = 1; i < nums.length - 1; i += 2) {

            int temp = nums[n];
            int j = n - 1;

            while (j >= i) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[i] = temp;

            n++;
        }

        return nums;
    }
}