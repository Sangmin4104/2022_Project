package spring_jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ConnectDB1 {
	private DataSource datasource; // 데이터베이스 연결정보

	// setter 메소드를 통해서 주입
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	//연결 메소드(임의로 정의한 메소드)
	public void connectTest() {
		Connection con = null;
		
		try {
			con = datasource.getConnection();
			System.out.println("연결성공");
			con.close();
			
		}catch(SQLException e) {
		e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("db.xml");
		ConnectDB1 cd = ctx.getBean("connectDB1", ConnectDB1.class);
		
		cd.connectTest(); // 메소드 호출(연결성공)
	}
}
