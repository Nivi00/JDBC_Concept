package com.edu;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

	public class CreatingTable {

		public static void main(String[] args) {
		String mytable="create table empdetail(eid int(4) primary key,ename varchar(20) not null)";
	   
		//connection code
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/world";
		String un="root";
		String pw="root";
		
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,un,pw);
			Statement st=conn.createStatement();
			st.execute(mytable);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}

	}
