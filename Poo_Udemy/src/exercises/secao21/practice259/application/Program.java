package exercises.secao21.practice259.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exercises.secao21.practice259.db.DB;
import exercises.secao21.practice259.db.DbException;

public class Program {
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		Statement st = null;
		
		ResultSet rs = null;
		
		try {
			
			con = DB.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM seller");
			
			while(rs.next()) {
				System.out.println(rs.getString("Name") + ", " + rs.getString("Email"));
			}
			
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		
	}
}
