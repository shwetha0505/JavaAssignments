package week3.day2;

public class OddIndex {

	public static void main(String[] args) {
		
		String s="changeme";

		int sLength=s.length();
		 char[] charArray=s.toCharArray();
		for(int i=0;i<sLength;i++){
		if(i%2==1)
			 charArray[i] = Character.toUpperCase(charArray[i]);
		
			System.out.print(charArray[i]);
		}

	}

}

