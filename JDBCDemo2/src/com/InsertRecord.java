package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
 
public class InsertRecord {
    public static void main(String[] args) {    
      
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
       //         Statement stmt=con.createStatement();
       //         stmt.execute("insert into emp1 values(100,'jai',23,40000,'clerk')");
                PreparedStatement pstmt=con.prepareStatement("insert into emp1 values(?,?,?,?,?)");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter ID ");
                int id = sc.nextInt();
                
                System.out.println("Enter Name ");
                String name= sc.next();
                
                System.out.println("Enter age ");
                int age = sc.nextInt();
                
                System.out.println("Enter salary ");
                int salary = sc.nextInt();
                
                System.out.println("Enter Designation ");
                String designation = sc.next ();
                
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, age);
                pstmt.setInt(4, salary);
                pstmt.setString(5, designation);
                pstmt.execute();
                pstmt.close();
                System.out.println("data inserted sucessfully...!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
 
}