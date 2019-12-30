package com.morcinka.pl.app.user.service;

import com.morcinka.pl.app.user.model.UserDTO;
import com.morcinka.pl.app.user.model.UserEntity;

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
