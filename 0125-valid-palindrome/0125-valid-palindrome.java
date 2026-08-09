class Solution {
    public boolean isPalindrome(String s) {

    String s3 = "";
     String s2 = "";
     
     if(s.length()==1)
     {
        return true;
     }

    for(int i=0 ;i<s.length();i++)
     {
        char ch = s.charAt(i);

         if((ch >='a' && ch<='z') || (ch >='A' && ch<='Z') || (ch>='0'&&ch<='9'))
         {
           ch = Character.toLowerCase(ch);
           s3=s3+ch;
         }
     }

     for(int i=s3.length()-1;i>=0;i--)
     {
        s2=s2+s3.charAt(i);
     }   

     if(s3.equals(s2)) 
     { 
        return true;
     }
     return false;
    }
}