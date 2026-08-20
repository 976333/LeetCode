class Solution {
    public int subsetXORSum(int[] nums) {

        int OR = 0;

        for (int num : nums) {
            OR = OR | num;
        }

        return OR * (1 << (nums.length - 1));
    }
}