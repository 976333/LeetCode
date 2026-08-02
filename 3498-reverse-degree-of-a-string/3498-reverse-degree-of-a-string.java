class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        int length = s.length()-1;
        while(length>=0)
         {
             int prod =26;
        for(char i = 'a';i<='z';i++)
        {
           
            if(s.charAt(length)==i)
            {
                result=result+(prod*(length+1));
                length--;
                break;
            }
            prod--;
        }
        }
        return result;
    }
}