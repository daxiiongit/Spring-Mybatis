package com.sunyanxiong.ssm.olddao.DaoImpl;

import com.sunyanxiong.ssm.olddao.User;
import com.sunyanxiong.ssm.olddao.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/12 0012.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
    @Override
    public User findUserById(int id) throws Exception {

        // 创建sqlSession
        SqlSession sqlSession = this.getSqlSession();
        // 查询数据
        User user = sqlSession.selectOne("test.findUserById",1);

        // 返回数据对象
        return user;
    }
}
