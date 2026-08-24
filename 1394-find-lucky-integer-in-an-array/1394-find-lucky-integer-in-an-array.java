class Solution {
    public int findLucky(int[] arr) {
        
        int lucky = -1;
        for(int i = 0;i<arr.length;i++)
        {
           
            int count = 0;
            for(int j = 0;j<arr.length;j++)
            {
                if(i>0 && arr[i]==arr[i-1])
                {
                    break;
                }

                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==arr[i] &&count>lucky)
            {
                lucky =count;
            }
        }
        return lucky;

    }
}