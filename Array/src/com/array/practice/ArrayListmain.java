package com.array.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListmain {
	
	public static void main(String[]args) {
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Aniket");
		al1.add("Rahul");
		al1.add("Soham");
		
		
		ArrayList <String>al2=new ArrayList<String>();
		al2.add("23");
		al2.add("43");
		al2.add("8");
		
	      al1.addAll(al2);
		
		System.out.println(al1);
		
		
		//by using iterator
		Iterator<String> itr=al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
