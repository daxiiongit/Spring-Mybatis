package com.sunyanxiong.ssm.mapper;

import com.sunyanxiong.ssm.olddao.User;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/12 0012.
 */
public interface UserMapper {

    // 查询接口
    public User findUserByIdMapper(int id) throws Exception;

}
