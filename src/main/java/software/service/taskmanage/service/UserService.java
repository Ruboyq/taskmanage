package software.service.taskmanage.service;

import software.service.taskmanage.domain.UserBean;

import java.util.List;

public interface UserService {
    /** 查询单个*/
    public UserBean selectById(int id);
}