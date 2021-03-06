package exercises.secao21.practice260.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import exercises.secao21.practice260.db.DB;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DB.getConnection();
			ps = con.prepareStatement(
					"INSERT INTO seller(Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, "Carl Purple");
			ps.setString(2, "carl@gmail.com");
			ps.setDate(3, new java.sql.Date(sdf.parse("05/01/1999").getTime()));
			ps.setDouble(4, 2000.00);
			ps.setInt(5, 2);

			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = ps.getGeneratedKeys();

				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			} else {
				System.out.println("No rows affected");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeConnection();
			DB.closePreparedStatement(ps);
		}
	}

}
