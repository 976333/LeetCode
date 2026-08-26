class Solution {
    public int countSeniors(String[] details) {

        int cont = 0;

        for(int i = 0; i < details.length; i++)
        {
            String s = details[i];

            String age = s.substring(11, 13);

            int result = Integer.parseInt(age);

            if(result > 60)
            {
                cont++;
            }
        }

        return cont;
    }
}