package software.service.taskmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import software.service.taskmanage.domain.UserBean;
import software.service.taskmanage.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/{id}/select")
    public UserBean getUser(@PathVariable("id")int id) {
        return userService.selectById(id);
    }
}
