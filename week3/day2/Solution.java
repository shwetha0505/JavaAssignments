package week3.day2;
public class Solution {
	public static String reverseString(String input) {
		
		
	
	
	
	

		int sLength=input.length();
		 char[] charArray=input.toCharArray();
		for(int i=sLength-1;i>=0;i--) {
			
			System.out.print(charArray[i]);
			
		}
		return input;
		}
		  public static void main(String[] args) {
				
		    
		    Solution.reverseString("TestLeaf");
		  }
}