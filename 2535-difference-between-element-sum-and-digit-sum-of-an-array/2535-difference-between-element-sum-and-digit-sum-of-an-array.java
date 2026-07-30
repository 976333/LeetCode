class Solution {
    public int differenceOfSum(int[] nums) {

        int numberSum =0;
        int digitSum = 0;

        for(int i =0;i<nums.length;i++)
        {
            numberSum += nums[i];
            if(nums[i]>9)
            {
                digitSum += digitsum(nums[i]);
            }
            else
            {
                digitSum += nums[i];
            }
        }
        int result =numberSum-digitSum;

        return result;

    }

    public static int digitsum(int digit)
    {
        int sum =0;

        while(digit>0)
        {
            sum+=digit%10;
            digit/=10;
        }
        return sum;
    }




}