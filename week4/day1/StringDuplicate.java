package week4.day1;


import java.util.LinkedHashSet;
import java.util.Set;


public class StringDuplicate {

	public static void main(String[] args) {
		
		String companyName="google";
		
		
		char[] arr=companyName.toCharArray();
		
		
		Set<Character> unique=new LinkedHashSet<Character>();
		for (int i = 0; i < arr.length; i++) {
			unique.add(arr[i]);
		}
		System.out.println(unique);
		}
	
	
		
		
	}


