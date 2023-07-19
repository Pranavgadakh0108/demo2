package Jdbc;
import java.sql.*;
public class Jdbc {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/final_practical","root","pranav"); 
		//here students is database name, root is username and password 
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from Students");
		while(rs.next()) 
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+rs.getString(4)+" "); 

	}

}
