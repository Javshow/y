package com.test;

import com.kgc.pojo.User;
import com.kgc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void testUser(){
        //获取sqlSession
        SqlSession sessin = MybatisUtil.getSessin();
        //执行SQL
        List<User> list = sessin.selectList("com.kgc.dao.UserDao.findAll");
        sessin.close();//释放资源
        System.out.println(list);
    }
}
