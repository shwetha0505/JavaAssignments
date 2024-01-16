package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListOfCompany {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("HCL");
		names.add("Wipro");
		names.add("Aspire Systems");
		names.add("CTS");
		int size=names.size();
		
		System.out.println("List of company names:"+names);
		Collections.sort(names); 
		System.out.println("Sorted list:"+names);
		 for (int i = size - 1; i >= 0; i--) 
	        { 
			 
	            System.out.println(names.get(i)); 
	        }
		
		}
		
		
	}


