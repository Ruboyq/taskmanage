package software.service.taskmanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.service.taskmanage.dao.UserDao;
import software.service.taskmanage.domain.UserBean;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 查询单个
     *
     * @param id
     */
    @Override
    public UserBean selectById(int id) {
        return userDao.selectById(id);
    }

}
