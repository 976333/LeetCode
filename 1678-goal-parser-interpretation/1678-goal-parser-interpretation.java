class Solution {
    public String interpret(String command) {

        String  result= "";
        for(int i =0;i<command.length();i++)
        {
            char ch = command.charAt(i);

            if(ch=='(')
            {
                char temp = command.charAt(i+1);
                if(ch=='(' && temp==')')
                {
                    result+='o';
                    i++;
                }
            }
            else if(ch==')') continue;
            else{
                 result+=ch;
            }
           
        }
        return result;
    }
}