class Solution {
    public int fib(int n) {
        

        int a= 0;
        int b = 1;
        int c;

        int  result = 0;

       int timepass = 1;

        while(timepass<=n)
        {
          
            c = a+b;
            int temp = b;
            b =c; 
            a = temp;
            result = a;
            timepass++;
        }
    return result;
    }
}