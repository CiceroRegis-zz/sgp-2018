package br.com.df.sgp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
	
	/*private static String driver = "com.mysql.jdbc.Driver";
	private static String usuario = "root";
	private static String senha = "root";
	private static String url = "jdbc:mysql://localhost:3306/sgp?useSSL=false";
	
	public static  Connection getConnection() throws SQLException{
		//Context ctx = null;
		Connection conn = null;		
		try {
			//ctx = new InitialContext();			
            //DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/sgpDS");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn, PreparedStatement pst, ResultSet rs){
		try {
			if(pst != null){pst.clearParameters(); pst.close();}
			if(rs != null){rs.close();}
			if(conn != null){conn.close();}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
/*
 * Heroku
 * private static String driver = "org.postgresql.Driver";
	private static String usuario = "jgdsixbpfnyyde";
	private static String senha = "962f52e81c9cf7c1c0218868c263aa7d90b484da3ae8691f0caa22b25850c4a4";
	private static String url = "jdbc:postgresql://ec2-54-83-29-34.compute-1.amazonaws.com:5432/dbrvdb02kmbg1e?sslmode=require";
 */
	private static String driver = "org.postgresql.Driver";
	private static String usuario = "jgdsixbpfnyyde";
	private static String senha = "962f52e81c9cf7c1c0218868c263aa7d90b484da3ae8691f0caa22b25850c4a4";
	private static String url = "jdbc:postgresql://ec2-54-83-29-34.compute-1.amazonaws.com:5432/dbrvdb02kmbg1e?sslmode=require";
	
	public static  Connection getConnection() throws SQLException{
		//Context ctx = null;
		Connection conn = null;		
		try {
			//ctx = new InitialContext();			
            //DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/sgpDS");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn, PreparedStatement pst, ResultSet rs){
		try {
			if(pst != null){pst.clearParameters(); pst.close();}
			if(rs != null){rs.close();}
			if(conn != null){conn.close();}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
