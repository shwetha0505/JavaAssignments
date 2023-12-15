package week1.assignment;

import java.util.Arrays;

public class FindMissingElements {
	

	public static void main(String[] args) {
		int[] values= {1,4,3,2,8,6,7};
		int totalLen=values.length;
		Arrays.sort(values);
		//System.out.println("Value in sorted order:" + Arrays.toString(values));
		//System.out.println(totalLen);
		
	for (int i = 0; i < totalLen; i++) { 
		if (values[i]!=i+1) {
	    int ns=i+1;
	    System.out.println("The missing value is:" + ns);
	    
		break;
		


		}
		

		
	}
	}
}


