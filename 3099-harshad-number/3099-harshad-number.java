class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        
        if(x%digitSum(x)==0)
        { 
            return digitSum(x);
        }
        else{
             return -1;
        }

    }



    public static int digitSum(int num)
    {
        int sum =0;

        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}