class Solution {
    public int maxFreqSum(String s) {
        
        int vowel = 0 ;
        int consonent = 0;

        for(int i =0;i<s.length();i++)
        {
            int ch = s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                int count = 0;
                 for(int j =i;j<s.length();j++)
                 {
                    if(ch==s.charAt(j))
                    {
                        count++;
                    }
                 }
                 if(vowel<count)
                 {
                    vowel = count;
                 }
            }
            else
            {
                int count = 0;
                for(int j = i;j<s.length();j++)
                {
                    
                    if(ch==s.charAt(j))
                    {
                        count++;
                    }
                }
                if(consonent<count)
                {
                    consonent= count;
                }
            }
        }
        return vowel + consonent;

    }
}