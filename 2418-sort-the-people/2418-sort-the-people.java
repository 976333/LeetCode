class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        

        String [] arr = new String [names.length];

        for(int j = 0;j<heights.length;j++)
        {
              int index = tallest(heights);
              arr[j]=names[index];
        }
        return arr;

    }

    public static int tallest(int [] heights)
    {
        int temp =Integer.MIN_VALUE;
        int index = -1;

        for(int i = 0;i<heights.length;i++)
        {
            if(heights[i]>temp)
            {
             temp = heights[i];
             index = i;   
            }
        }
        heights[index]=0;
        return index;
    }
}