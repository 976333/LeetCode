class Solution {
    public boolean checkPerfectNumber(int num) {
        int prod = 0;
        int temp = 1;

        while((num/2)>=temp )
        {
            if(num%temp==0)
            {
                prod +=temp;
            }
            temp++;
        }

        if(prod==num)
        {
            return true;
        }
        else{
        return false;
        }
     
    }
}