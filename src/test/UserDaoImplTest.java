package test;

import com.sunyanxiong.ssm.mapper.UserMapper;
import com.sunyanxiong.ssm.olddao.User;
import com.sunyanxiong.ssm.olddao.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: 测试整合查询
 * <p>
 * Created by daxiongit on 2016/5/12 0012.
 */
public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    @Before
    public void before(){

        // 读取spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");

    }

    @Test
    public void testFindUserById() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);

        // 打印结果
        System.out.println(user);

    }

    // 采用 mapper 代理的方式来查询
    @Test
    public void testFindUserByIdMapper() throws Exception {

        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserByIdMapper(1);

        System.out.println(user);

    }

}
