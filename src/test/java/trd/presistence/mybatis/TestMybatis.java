package trd.presistence.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import util.JsonUtil;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    @Test
    public void  test1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
//        Configuration configuration = sqlSessionFactory.getConfiguration();
        System.out.println(sqlSessionFactory.getClass());

    }
}
