package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> sec= new ArrayList<Integer>();
		

		sec.add(3);
		sec.add(2);
		sec.add(11);
		sec.add(4);
		sec.add(6);
		sec.add(7);
		 Collections.sort(sec);
		 System.out.println("Sorted list:" +sec);
		System.out.println(sec.get(sec.size()-2));

	}

}
