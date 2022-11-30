package spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateTest {
	private JdbcTemplate jdbcTemplate;
	
	// 생성자
	public UpdateTest(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	// 수정할 메소드 작성(메소드 오버로딩)
	public void update(String name) {
		int updateCount = jdbcTemplate.update
				("update singer_group set member = 6 where name = ?", name);
		System.out.println(updateCount + "개 수정");
		
	}
	public void update(Singer singer) {
		int updateCount = jdbcTemplate.update
				("update singer_group set member = ? where name = ?", singer.getMember(), singer.getName());
		System.out.println(updateCount + "개 수정");
	}
	
	public static void main(String[] args) {
	      ApplicationContext ctx = new GenericXmlApplicationContext("update.xml");
	      
	      UpdateTest ut = ctx.getBean("updateTest", UpdateTest.class);
	      ut.update("그룹이름");
	      ut.update(new Singer("그룹이름", 5));

	}
}
