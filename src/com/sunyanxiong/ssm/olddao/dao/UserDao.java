package com.sunyanxiong.ssm.olddao.dao;

import com.sunyanxiong.ssm.olddao.User;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/12 0012.
 */
public interface UserDao {

    public User findUserById(int id) throws Exception;

}
