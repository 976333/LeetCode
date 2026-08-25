class Solution {
    public int missingMultiple(int[] nums, int k) {
        
     for(int i = 0; i<nums.length;i++)
     {
        
        int temp = k*(i+1);
        int count =0;
        for(int j = 0; j<nums.length;j++)
        {
            if(temp==nums[j])
            {
                count++;
                break;            
            }
        }
        if(count==0)
        {
            return temp;
        }

        if(i==(nums.length-1))
        {
            return temp+k;
        }
     }


     return -1;
    }
}