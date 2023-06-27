package com;
import java.util.*;

public class Demo4{
	public static void main(String[] args) { 
		// LIST
		// SET
		//set + list= map

		//HashSet a1= new HashSet<>(); // no duplicate
		//LinkedHashSet a1 = new LinkedHashSet<>(); // no duplicates + user entered order //
		//TreeSet a1 = new TreeSet(); // no dup + sorted order
		//HashMap map= new HashMap<>(); // no duplicate
		//LinkedHashMap map = new LinkedHashMap<>(); // no dup + user entered order

		TreeMap map = new TreeMap<>();

		map.put(111, "Suresh");
		map.put(555, "Ramesh");
		map.put(666, "Abhi");
		map.put(234, "Chandan");
		map.put (777, "pratha");
		map.put(666, "Mavith");
		map.put(222, "Ram");

		Set s=map.entrySet();

		 Iterator i=s.iterator();
	        while(i.hasNext()) {
	            System.out.println(i.next());
	        }
	}
}
	
