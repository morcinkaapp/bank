package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import user.model.UserEntity;
import user.service.UserService;

/**
 * @author Przemysław Jambor
 */
@RestController("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public void createUser(UserEntity userEntity) {
        this.userService.createUser(userEntity);
    }

    @GetMapping("/all")
    public void getAllUsers() {
        this.userService.getAllUsers();
    }

}