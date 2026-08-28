class Solution {
    public boolean divisorGame(int n) {
        
        int alice = 0;
        int bob = 0;

    while(n>1)
    {

       for(int i = 1; i<n;i++)
       {
        if(n%i==0)
        {
            if(alice==0)
            {
                 alice =1;
                 bob =0;
            }
            else 
            {
                 bob =1;
                 alice =0;
            }
           
            n=n-i;
            break;
        }
       }
    }
    if(alice==1)
    {
        return true;
    }
    else
    {
        return false;
    }

}
}