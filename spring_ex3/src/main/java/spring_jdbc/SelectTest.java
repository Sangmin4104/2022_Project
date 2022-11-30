package spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectTest {
	private JdbcTemplate jdbcTemplate;
	
	// 생성자를 통해 주입하기
	public SelectTest(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// 조회 메소드 ==> 레코드 값이 1개
	public void query1() {
		int count = jdbcTemplate.queryForObject
				("select count(*) from singer_group", Integer.class);
		System.out.println(count+"개가 조회됨");
	}
	
	public void query2(String name) {
		int count = jdbcTemplate.queryForObject
				("select member from singer_group where name=?", Integer.class, name);
		System.out.println(name + " 인원은 " + count);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("select.xml");
	      
	      SelectTest st = ctx.getBean("selectTest", SelectTest.class);
	      st.query1();
	      st.query2("그룹이름");

	}
}
