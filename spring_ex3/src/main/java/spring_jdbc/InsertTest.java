package spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertTest {
   private JdbcTemplate jdbcTemplate;
   
   //생성자->주입공간->데이터베이스연결
   public InsertTest(JdbcTemplate jdbcTemplate) {
      super();
      this.jdbcTemplate = jdbcTemplate;
   }
   
   //삽입기능이 있는 사용자 정의 메서드
   public void insert(Singer singer) {
      int count=jdbcTemplate.update("insert into singer_group values (?,?)", singer.getName(), singer.getMember());
      System.out.println(count+"개 삽입");
   }
   
   public static void main(String[] args) {
      ApplicationContext ctx = new GenericXmlApplicationContext("insert.xml");
      
      InsertTest it = ctx.getBean("insertTest",InsertTest.class);
      it.insert(new Singer("그룹이름",10));
   }
}
