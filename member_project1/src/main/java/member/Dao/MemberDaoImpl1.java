package member.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import member.Dto.MemberVo;

public class MemberDaoImpl1 implements MemberDao {
	private JdbcTemplate JdbcTemplate;
	
	// 생성자 주입
	public MemberDaoImpl1(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) {
		super();
		JdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public MemberVo selectByEmail(String email) {
		String sql = "select * from member where email = ?";
		List<MemberVo> members = JdbcTemplate.query(sql, 
				new RowMapper<MemberVo>() {
				public MemberVo mapRow(ResultSet rs, int rowNum) throws SQLException{
					MemberVo member = new MemberVo(rs.getString("email"),
							rs.getString("password"),
							rs.getString("name"),
							rs.getTimestamp("regdate"));
					// 매개변수 생성자를 통해서 객체 생성
					member.setId(rs.getLong("id"));
					return member;
				}
		} ,email);
		return members.isEmpty()? null : members.get(0);
	}


	@Override
	public void insert(MemberVo member) {
		String sql = "insert into member (email, password, name, regdate) values (?,?,?,?)";
		
		JdbcTemplate.update(sql, member.getEmail(), member.getPassword(), member.getName(), member.getRegisterDate());

	}

	@Override
	public void update(MemberVo member) {
		String sql = "update member set password = ? where email = ?";
		
		JdbcTemplate.update(sql, member.getPassword(), member.getEmail());
	}

	@Override
	public Collection<MemberVo> selectAll() {
		String sql = "select * from member";
		List<MemberVo> members = JdbcTemplate.query(sql, new RowMapper<MemberVo>() {
			public MemberVo mapRow(ResultSet rs, int rowNum) throws SQLException{
				Long id = rs.getLong("id");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String name = rs.getString("name");
				Date registerDate = rs.getTimestamp("regdate"); 
				
				MemberVo member = new MemberVo(email, password, name, registerDate);
				member.setId(id);
				return member;
			}
		});
		return members;
	}

	@Override
	public void delete(MemberVo member) {
		String sql = "delete from member where id = ?";
		
		JdbcTemplate.update(sql, member.getId());

	}

}
