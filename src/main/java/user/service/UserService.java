package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.model.UserDTO;
import user.model.UserEntity;
import user.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

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

    public void createUser(UserDTO userDTO) {
        UserEntity userEntity = UserMapper.mapToUserEntity(userDTO);
        userRepository.save(userEntity);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::mapToUserDTO)
                .collect(Collectors.toList());
    }

}
