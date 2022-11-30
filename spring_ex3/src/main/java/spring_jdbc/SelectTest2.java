package spring_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SelectTest2 {
	private JdbcTemplate jdbcTemplate;

	// 생성자 주입
	public SelectTest2(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	// sql 관련 메소드들
	public void queryForList1(int member) {
		List<String> singers = jdbcTemplate.queryForList(
				"select name from singer_group where member = ?", String.class, member);
		
		for(int i=0; i<singers.size(); i++) {
			String groupname = singers.get(i);
			System.out.println("그룹명 " + groupname);
		}
	}
	
	public List<Singer> query1(int member){
		List<Singer> singerList = jdbcTemplate.query("select * from singer_group where member = ?", 
						new RowMapper<Singer>() {
						public Singer mapRow(ResultSet rs, int rowNum) throws SQLException{
							Singer s = new Singer();
							s.setName(rs.getString("name"));
							s.setMember(rs.getInt("member"));
							return s;
						}
		} ,member);
		
		return singerList;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("select2.xml");
		SelectTest2 st = ctx.getBean("select2", SelectTest2.class);
		
		st.queryForList1(5);
		
		List<Singer> singerList = st.query1(5);
		for(int i=0; i<singerList.size(); i++) {
			Singer s = singerList.get(i);
			System.out.println("그룹이름 : " + s.getMember() + " 멤버 수 : " + s.getMember());
		}
	}
}
