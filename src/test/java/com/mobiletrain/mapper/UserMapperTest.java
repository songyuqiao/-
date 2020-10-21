package com.mobiletrain.mapper;

import com.mobiletrain.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class UserMapperTest {
    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before
    public void init(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            sqlSession = build.openSession(true);
            userMapper = sqlSession.getMapper(UserMapper.class);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @After
    public void destory(){
        sqlSession.close();
    }

    @Test
    public void queryByUsernameAndPassword(){
        List<User> users = userMapper.queryByUsernameAndPassword("mobiletrain" , "670b14728ad9902aecba32e22fa4f6bd");
        System.out.println(users);
    }
}
