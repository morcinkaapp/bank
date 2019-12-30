package com.morcinka.pl.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import com.morcinka.pl.app.user.model.UserDTO;
import com.morcinka.pl.app.user.model.UserEntity;
import com.morcinka.pl.app.user.repository.UserRepository;

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

    @EventListener(ApplicationReadyEvent.class)
	public void addExamplesUsers() {

		UserEntity user1 = UserEntity.builder()
				.withLogin("login1")
				.withPassword("haslo1")
				.build();

		UserEntity user2 = UserEntity.builder()
				.withLogin("login1")
				.withPassword("haslo1")
				.build();

		userRepository.save(user1);
		userRepository.save(user2);
	}

}
