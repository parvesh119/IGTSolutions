package p3;

public class Demo2{
	public static void main(String[] args) {

		String s= new String("Ramesh"); //we cangt modify its immuatable
		System.out.println(s); 
		s.concat("Kumar");
		
		s.concat("Kumar"); 
		System.out.println(s);

// its a thread safe 1 one onle there will execute

		StringBuffer sb=new StringBuffer ("Pravin"); 
		sb.append("KUMAR"); 
		System.out.println (sb);// muatable, we can chage or modify

		sb.insert(0, "MR");
		System.out.println(sb);

		sb.delete(0,3);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

// thred not safe 
		StringBuilder sbl= new StringBuilder("Charan");
		sbl.append("Kuanr");
		System.out.println(sbl);
	}
}