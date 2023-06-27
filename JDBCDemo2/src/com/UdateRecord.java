package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UdateRecord {
	public static void main(String[] args) {    
	      
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
                PreparedStatement pstmt=con.prepareStatement("Update Emp1  set Salary= ? where id=?");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter ID ");
                int id = sc.nextInt();
                
                System.out.println("Enter salary ");
                int salary = sc.nextInt();
                
                pstmt.setInt(1, salary);
                pstmt.setInt(2, id);
                
                pstmt.execute();
                pstmt.close();
                System.out.println("data inserted sucessfully...!");
        } catch (Exception e) {
            System.out.println(e);
        }
	}
                
}
