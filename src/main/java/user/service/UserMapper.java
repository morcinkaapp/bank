package user.service;

import user.model.UserDTO;
import user.model.UserEntity;

/**
 * @author Jarosław Kaczmarek
 */
public class UserMapper {

    public static UserEntity mapToUserEntity(UserDTO userDTO) {
        return UserEntity.builder()
                .withLogin(userDTO.getLogin())
                .withPassword(userDTO.getPassword())
                .build();
    }

    public static UserDTO mapToUserDTO(UserEntity userEntity) {
        return UserDTO.builder()
                .withLogin(userEntity.getLogin())
                .withPassword(userEntity.getPassword())
                .build();
    }

}
