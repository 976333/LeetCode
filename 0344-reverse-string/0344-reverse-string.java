class Solution {
    public void reverseString(char[] s) {
        
        char temp = ' ';
        int pointer = 0;

        for(int i= s.length-1;i>=s.length/2;i--)
        {
           temp = s[pointer];
           s[pointer]=s[i];
           s[i]=temp;
           pointer++;
        }
    }
}