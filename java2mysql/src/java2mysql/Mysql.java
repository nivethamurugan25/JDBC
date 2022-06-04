package java2mysql;

import java.sql.*;

public class Mysql {

	public static void main(String[] args) {
		try{ Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs","root","Nivethamurugan@25"); 
		Statement st=con.createStatement(); 
		ResultSet rs=st.executeQuery("select * from jdeveloper");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)); 
		} 
		} 
		catch(Exception e)
		{ 
			System.out.println(e.toString());
			}
	}

}
