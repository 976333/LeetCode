import java.util.Arrays;

class Solution {
    public int distributeCandies(int[] candyType) {
        // Sort the array to group identical candy types together
        Arrays.sort(candyType);
        
        // Start with 1 unique candy (the first element)
        int uniqueCount = 1;
        int maxAllowed = candyType.length / 2;
        
        // Loop through the array starting from the second element
        for (int i = 1; i < candyType.length; i++) {
            // If the current candy is different from the previous one, it's a new type
            if (candyType[i] != candyType[i - 1]) {
                uniqueCount++;
            }
            
            // Early exit optimization: if we hit the limit, stop counting
            if (uniqueCount >= maxAllowed) {
                return maxAllowed;
            }
        }
        
        // Return the smaller value between total unique types and the limit
        return Math.min(uniqueCount, maxAllowed);
    }
}