package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadRecord {
	public static void main(String[] args) {    
	      
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
               
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("Select * from emp1");
                while(rs.next()) {
                	System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getInt(3) + " : " + rs.getFloat(4) + " : " + rs.getString(5));
                }
        } catch (Exception e) {
            System.out.println(e);
        }
	}
                
}