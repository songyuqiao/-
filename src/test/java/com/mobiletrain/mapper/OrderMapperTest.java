package com.mobiletrain.mapper;

import com.mobiletrain.domain.Order;
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

public class OrderMapperTest {
    private SqlSession sqlSession;
    private OrderMapper orderMapper;

    @Before
    public void init(){
        try {
            //获取mybatis-config.xml配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            sqlSession = build.openSession(true);
            orderMapper = sqlSession.getMapper(OrderMapper.class);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @After
    public void destory(){
        sqlSession.close();
    }

    @Test
    //查询所有
    public void testQueryAll(){
        List<User> users = orderMapper.queryAll();
        System.out.println(users);
    }

    @Test
    public void testQueryById(){
        Order order = orderMapper.queryById(1);
        System.out.println(order);
    }


    @Test
    public void delete(){
        int result = orderMapper.delete(2);
        System.out.println(result);
    }
}
