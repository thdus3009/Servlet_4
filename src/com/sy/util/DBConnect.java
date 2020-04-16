package com.sy.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	//main이 제일먼저 실행된다!!.
	public static void main(String[] args) {
		//연동이 잘 되었는지 확인작업 (콘솔창에 띄워보기 / Window-Show View)
		Connection con;
		try {
			con = DBConnect.getConnection();
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static Connection getConnection() throws Exception{
		//작성은 이거먼저!
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		//연결!
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	}
}
