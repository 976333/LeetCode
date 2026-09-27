class Solution {
    public String reversePrefix(String s, int k) {
	 String n ="";
	 int start = 0;	 

	 for(int i= s.length()-1; i>=0;i--)
	 {
		 if(i>=k)
		 {
			n = s.charAt(i)+ n; 
		 }
		 else
		 {
			 n= s.charAt(start)+n;
			 start++;
		 }
	 }
      return n;
    }
   
}