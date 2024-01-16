package week3.day2;

public class ReverseOdd {
	public static void main(String[] args) {
		
	
String str="I am a software tester from Testleaf";
	 String[] words = str.split(" ");
	   String r = "";
	   String k = "";
	    for(int i=0; i<words.length; i++) {
	    if(i%2 == 0)
	     System.out.print(" " + words[i] + " ");
	       else
	       r = words[i];
	                
	        for (int j = r.length()-1; j >= 0; j--)  {
	          k = "" + r.charAt(j);
	           System.out.print(k);
	                }
	             r = "";
	        }   
	    }
}