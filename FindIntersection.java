package week1.assignment;

import java.util.Arrays;

public class FindIntersection 
{
	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		int m =a.length;
		int n=b.length;
		Arrays.sort(a);
		Arrays.sort(b);

		System.out.println("Common Value:");
	
       for (int i = 0; i < m; i++) {
		int j = a[i];
		 for (int k = 0; k < n; k++) {
			int l=b[k];
			if(j==l) {
				
				System.out.println(j);
			
				
			}
			
		 }
       }

	}}

