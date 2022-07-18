package exercises.secao21.practice257.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exercises.secao21.practice257.db.DB;
import exercises.secao21.practice259.db.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try{
			con = DB.getConnection();
			
			st = con.createStatement();
			
			rs = st.executeQuery("SELECT * FROM department");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id")+", "+ rs.getString("Name"));
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.CloseConnection();
		}
	}

}
