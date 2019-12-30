package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import user.model.UserDTO;
import user.service.UserService;

import java.util.List;

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
    public void createUser(@RequestBody UserDTO userDTO) {
        this.userService.createUser(userDTO);
    }

    @GetMapping("/all")
    public List<UserDTO> getAllUsers() {
        return this.userService.getAllUsers();
    }

}
