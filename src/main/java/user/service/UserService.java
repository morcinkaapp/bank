package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.model.UserEntity;
import user.repository.UserRepository;

import java.util.List;

/**
 * @author Przemysław Jambor
 */
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

}
