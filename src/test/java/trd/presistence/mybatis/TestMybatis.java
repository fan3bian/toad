package trd.presistence.mybatis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fan3bian.toad.domain.entity.User;
import com.fan3bian.toad.mapper.UserMapper;
import domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import util.DateUtil;
import util.JsonUtil;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMybatis {
    @Test
    public void  test1() throws IOException {
        /**
         * 加载配置文件(jdbc连接信息) 和 mapper(映射)
         * 创建sqlSession(与数据库的链接)
         * sqlSession执行statement(sql)，携带入参
         *
         */
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
//        Configuration configuration = sqlSessionFactory.getConfiguration();
        System.out.println(sqlSessionFactory.getClass());//org.apache.ibatis.session.defaults.DefaultSqlSessionFactory
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        User user= sqlSession.selectOne("com.fan3bian.toad.mapper.UserMapper.getUser", 12);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUser(12L);
        User user2 = userMapper.getUser(12L);
        System.out.println(user==user2);
        System.out.println(JsonUtil.toJson(user));
        User addUser = new User();
        addUser.setId(2019L);
        addUser.setPassword("2019");
        addUser.setUsername("2019");
        addUser.setCreateTime(new Date());
        int insert = userMapper.insert(addUser);
        System.out.println(insert);
                System.out.println(JsonUtil.toJson(addUser));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void aVoidtestCache() throws IOException{
        //mybatis一级缓存：相同线程，先访问缓存，缓存不存在访问数据库，并加载结果至缓存。若对结果进行更改，缓存也会改。
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
//        Configuration configuration = sqlSessionFactory.getConfiguration();       System.out.println(sqlSessionFactory.getClass());//org.apache.ibatis.session.defaults.DefaultSqlSessionFactory
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        User user= sqlSession.selectOne("com.fan3bian.toad.mapper.UserMapper.getUser", 12);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUser(12L);
        System.out.println(JsonUtil.toJson(user));
        //中间发生更新会删除缓存
        User addUser = new User();
        addUser.setId(2019L);
        addUser.setPassword("2019");
        addUser.setUsername("2019");
        addUser.setCreateTime(new Date());
        int insert = userMapper.insert(addUser);


        user.setUsername("quao");
        User user2 = userMapper.getUser(12L);
        System.out.println(user==user2);
        System.out.println(JsonUtil.toJson(user2));
    }
    @Test
    public void  test3(){

//        BigDecimal b = new BigDecimal(874.0);
//        if (new BigDecimal(b.intValue()).compareTo(b) != 0){
//            System.out.println("aa");
//        }
        Date date = new Date();
//
//        Student s=new Student();
//        s.setDate(new Date());
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd";
//        System.out.println(JSON.toJSONString(s, SerializerFeature.WriteDateUseDateFormat));
        Date date1 = DateUtil.parseDate("2020-08-07",DateUtil.DATE_FORMAT);
        Date date2 = DateUtil.parseDate("2020-08-12",DateUtil.DATE_FORMAT);
        Date date3 = DateUtil.parseDate("2020-08-10",DateUtil.DATE_FORMAT);
        Date date4 = DateUtil.parseDate("2020-08-11",DateUtil.DATE_FORMAT);
        Map<Date,String> map =new TreeMap<>();
        map.put(date1,"a");
        map.put(date2,"b");
        map.put(date3,"c");
        map.put(date4,"c");
        System.out.println(JSON.toJSONString(map, SerializerFeature.WriteDateUseDateFormat));

    }

}
