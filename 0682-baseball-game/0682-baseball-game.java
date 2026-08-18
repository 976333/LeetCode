class Solution {
    public int calPoints(String[] operations) {

        int[] arr = new int[operations.length];
        int temp = 0;

        for (int i = 0; i < operations.length; i++) {

            String s = operations[i];

           
            if (!s.equals("C") && !s.equals("D") && !s.equals("+")) {

                arr[temp] = Integer.parseInt(s);
                temp++;
            }

          
            else if (s.equals("C")) {

                temp--;
            }

            else if (s.equals("D")) {

                arr[temp] = 2 * arr[temp - 1];
                temp++;
            }

            else if (s.equals("+")) {

                arr[temp] = arr[temp - 1] + arr[temp - 2];
                temp++;
            }
        }

        int result = 0;

        for (int i = 0; i < temp; i++) {
            result += arr[i];
        }

        return result;
    }
}