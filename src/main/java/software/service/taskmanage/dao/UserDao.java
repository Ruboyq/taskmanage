package software.service.taskmanage.dao;

import org.springframework.stereotype.Repository;
import software.service.taskmanage.domain.UserBean;

@Repository
public interface UserDao {
    UserBean selectById(int id);
}
