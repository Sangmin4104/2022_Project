package mybatisExam;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ConnectionTest {
   private SqlSession sqlSession;

   public ConnectionTest(SqlSession sqlSession) {
      super();
      this.sqlSession = sqlSession;
   }
   
   public static void main(String[] args) {
      ApplicationContext ctx = new GenericXmlApplicationContext("mappers/beans1.xml");
      
      ConnectionTest test1 = ctx.getBean("ConnectionTest", ConnectionTest.class);
      
      System.out.println("연결성공");
   }
   
   
}
