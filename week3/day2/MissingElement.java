package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		List<Integer> m=new ArrayList<Integer>();
		
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(11);
		m.add(6);
		m.add(8);
		Collections.sort(m);
		
		System.out.println("Sorted list:"+m);
		int f = m.get(0);
		int l = m.get(m.size()-1);
		System.out.println("Number missing in the List : ");
		for(int i=f+1; i<l; i++){
		    if(!m.contains(i))
		          System.out.println(+i);
		    
			}
	}
}
            
      
	
	
    

	


