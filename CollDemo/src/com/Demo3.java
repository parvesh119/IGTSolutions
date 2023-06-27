package com;
import java.util.*;

public class Demo3 {
	public static void main(String[] args) {
		// List will allow the duplicates
		// ArrayList a1 = new ArrayList<>();
		// LinkedList a1 = new LinkedList();
		// VectorList a1 = new VectorList<>();
		// Stack a1 = new Stack<>();
		
		//SET
		
		// HashSet a1 = new HashSet<>();
		//  LinkedHashSet a1 = new LinkedHashSet<>();// no Duplicate

		TreeSet a1=new TreeSet();    // no dup +sorted order
		a1.add(100);
		a1.add(100);
		a1.add(200);
		a1.add(200);
		a1.add(700);
		a1.add(450);
		a1.add(987);
		a1.add(600);
		//a1.add("ABC");
		//a1.add("Ram");
		//a1.add("XYZ");
		//a1.add("DEF");
	
        Iterator i=a1.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
	}
}

//    List							SET
//====================================================================
//	Duplicate						no allow the duplicate values
//	will maintain the order			hashset: No order
// 									Linked hashset: no Duplicate + user entered order
//									TreeSet : no dup + sorted Order