package p3;

public class StringDemo {
	public static void main(String[] args) {
	
		String name="ParVESH Is traiNEE";
		System.out.println(name);
		
		String s=new String("Ramesh");
		System.out.println(s);
		
		System.out.println(name.length());
		System.out.println(name.trim().length());
		System.out.println(""+name.replace("P","t"));
		System.out.println(s.length());
		System.out.println(s.endsWith("h"));
		System.out.println(s.equalsIgnoreCase("ramesh"));
		System.out.println(s.charAt(2));
	}

}
