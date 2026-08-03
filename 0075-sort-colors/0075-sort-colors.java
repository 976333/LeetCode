import java.util.Arrays;
class Solution {
    public void sortColors(int[] nums) {
        
int red = 0;
int white = 0;
int blue = 0;


     for(int i =0;i<nums.length;i++)
     {
        if(nums[i]==0)
        {
            red++;
        }
        else if(nums[i]==1)
        {
            white++;
        }
        else
        {
            blue++;
        }
     }

    int k = 0;

     while(red>0)
     {
        nums[k]=0;
        red--;
        k++;
     }
      while(white>0)
     {
        nums[k]=1;
        white--;
        k++;
     }
      while(blue>0)
     {
        nums[k]=2;
        blue--;
        if(nums.length-1>=k)
        {
            k++;
        }
     }

}
}