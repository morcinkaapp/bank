package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import user.service.UserService;

/**
 * @author Przemysław Jambor
 */

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void createUser() {
        this.userService.createUser();
    }

    public void login() {
        this.userService.login();
    }
}
