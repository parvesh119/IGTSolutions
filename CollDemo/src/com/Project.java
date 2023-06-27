package com;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Emp
	{

		int id;
		String name;
		String desig;
		Scanner sc= new Scanner (System.in); 
		Emp ()
		{
			System.out.println("Enter id :");int id=sc.nextInt(); 
			System.out.println("ENter Name "); String name=sc.next();
			System.out.println("Enter Desig"); String desig=sc.next();
		}
		void display()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(desig);
		}
	}

public class Project 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in); 
		ArrayList al = new ArrayList<>();
		int ch=0;
		do {
			System.out.println("Enter Choice:");
			System.out.println("Enter id :");
			System.out.println("Enter id :");
			ch=sc.nextInt();
			if(ch==1) {
				Iterator<E> i=al.iterator();
				while(i.hasNext()) {
					Emp e=(Emp)i.next();
					System.out.println(i.next());
				}
			}
			
		}while(ch==3)
		
	}
}
