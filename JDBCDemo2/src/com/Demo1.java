package com;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class Demo1 {
    public static void main(String[] args) {    
      
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
                Statement stmt=con.createStatement();
                stmt.execute("insert into emp1 values(100,'jai',23,40000,'clerk')");
                stmt.close();
                System.out.println("data inserted sucessfully...!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
 
}