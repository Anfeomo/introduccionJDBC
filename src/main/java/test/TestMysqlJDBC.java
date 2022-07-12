package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMysqlJDBC {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicRetriveal=true";
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(url,"root","And&%$");
			Statement instruccion = conexion.createStatement();
			String sql = "SELECT * FROM persona";
			ResultSet resultado = instruccion.executeQuery(sql);
			while(resultado.next()) {
				System.out.println("resultado: "+resultado);
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}
}
