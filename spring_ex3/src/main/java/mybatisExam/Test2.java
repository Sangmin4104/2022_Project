package mybatisExam;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test2 {
	private SqlSession sqlSession;
	
	// 생성자 주입
	public Test2(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}
	
	// sql 호출하는 메소드 정의
	public void selectOne(String name) {
		Singer singer = sqlSession.selectOne("SingerMapper1.getSinger", name);
		// selectOne : 조회한 레코드가 1개
		// selectOne("네임스페이스 이름.id명", 매개변수)
		System.out.println(singer); //객체정보 -> singer.toString()
		
	}
	
	public void selectList(int member) {
		List<Singer> singers = sqlSession.selectList("SingerMapper1.getSingers", member);
		// selectList: 여러개의 레코드값이 조회
		for(Singer singer : singers) {
			System.out.println("그룹이릅: " + singer.getName());
		}
		
	}
	public void selectOne1() {
		int count = sqlSession.selectOne("SingerMapper1.getSingerCount");
		System.out.println("그룹수 : " + count);
	}
	
	public void insert(Singer singer) {
		int count = sqlSession.insert("SingerMapper1.insertSinger", singer);
		System.out.println(count + "개 삽입");
	}
	
	public void update(Singer singer) {
		int count = sqlSession.update("SingerMapper1.updateSinger", singer);
		System.out.println(count + "개 수정");
	}
	
	public void delete(String name) {
		int count = sqlSession.delete("SingerMapper1.deleteSinger", name);
		System.out.println(count + "개 삭제");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("mappers/beans2.xml");
		Test2 test2 = ctx.getBean("text2", Test2.class);
		test2.selectOne("그룹이름"); // 레코드가 1개
		test2.selectList(7); // 여러개 레코드 값
		test2.selectOne1(); // 레코드 1개
		test2.insert(new Singer("그룹이름", 5));
		test2.update(new Singer("수정하고 싶은 그룹 이름", 5));
		test2.delete("그룹이름");
	}
}
