class Solution {
    public String reverseVowels(String s) {

        String vowel = "";//AeeI
        int counter = 0;
        String fin = "";

        for(int i= 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
            {
               vowel = ch + vowel;
            }
        }

         for(int j=0; j<s.length();j++)
        {
            char rev = s.charAt(j);

            if(rev == 'a'||rev == 'e'||rev == 'i'||rev == 'o'||rev == 'u'||rev == 'A'||rev== 'E'||rev == 'I'||rev == 'O'||rev == 'U')
            {
                fin = fin +vowel.charAt(counter);
                counter++;
            }
            else
            {
                 fin = fin +rev;
            }
             
            
        }
        return fin;
    }
}