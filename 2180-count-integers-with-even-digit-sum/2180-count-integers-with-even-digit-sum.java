class Solution {
    public int countEven(int num) {
        
     int n = 2;
     int count = 0;
        
    while(n<=num)
    {
        int sum = digitsum(n);
        if(sum%2==0)
        {
            count++;
        }
        n++;
    }
    return count;
    
}
public static int digitsum(int n)
{
    int sum = 0;
    while(n>0)
    {
        sum = sum+n%10;
        n/=10;
    }
   
    return sum;
}
}