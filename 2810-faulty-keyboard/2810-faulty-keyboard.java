class Solution {
    public String finalString(String s) {
        
        String temp = "";

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='i')
            {
                 temp +=s.charAt(i);
            }
            else{
                 temp =reverse(temp);
                }
        }
        return temp;
    }


    public static String reverse(String str)
    {
        String rev ="";

        for(int j =str.length()-1;j>=0;j--)
        {
            rev+=str.charAt(j);
        }
        return rev;
    }
}