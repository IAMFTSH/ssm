import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.me.learn_ssm.config.myConfig;
import org.me.learn_ssm.entity.Account;
import org.me.learn_ssm.dao.AbstractAccountMapper;
import org.me.learn_ssm.service.BaseAccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.Reader;

public class Test {
    @org.junit.Test
    public void run1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class) ;
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        BaseAccountService baseAccountService= (BaseAccountService) context.getBean("AccountServiceImpl");
        baseAccountService.test();
    }
    @org.junit.Test
    public void run2() throws IOException {
        SqlSession sqlSession = null;
        sqlSession = new Test().getSqlSession();

        AbstractAccountMapper abstractAccountMapper = sqlSession.getMapper(AbstractAccountMapper.class);
        System.out.println(abstractAccountMapper.accountList());
    }
    @org.junit.Test
    public void run3() throws IOException {
        SqlSession sqlSession = null;
        sqlSession = new Test().getSqlSession();

        AbstractAccountMapper abstractAccountMapper = sqlSession.getMapper(AbstractAccountMapper.class);
        Account account=new Account(5,"aaa",1);
        System.out.println(abstractAccountMapper.setAccount(account));
        sqlSession.commit();
        sqlSession.close();
    }
    public SqlSession getSqlSession() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
