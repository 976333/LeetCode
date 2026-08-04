import java.util.*;
class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        
        ArrayList<Integer> arr = new ArrayList<>();
       
        int freq = 0;
        for(int i = 0;i<nums.length;i+=2)
        {
            int temp=nums[i+1];
            int arrval = nums[i];
            while(arrval>0)
            {
                arr.add(temp);
                arrval--;
                freq++;
            }
            if(i==nums.length-1)
            {
                break;
            }
        }

        int[] ans = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}