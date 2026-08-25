class Solution {
    public long removeZeros(long n) {
        
      long result = 0;

        while(n>0)
        {
            long last = n%10;

            if(last!=0)
            {
                long temp = mod(result,last);
                result = temp + result;
            }
            n/=10;

        }
        return result;
    }

    public static long mod(long result,long last)
    {
        long count = count(result);

        while(count!=0)
        {
            last*=10;
            count--;
        }
        return last;

    }

    public static long count(long result)
    {
        long count = 0;

        while(result!=0)
        {
            count++;
            result/=10;

        }
        return count;

    }
 
}