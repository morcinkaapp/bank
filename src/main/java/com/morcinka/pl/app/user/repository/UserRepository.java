package com.morcinka.pl.app.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.morcinka.pl.app.user.model.UserEntity;

/**
 * @author Jarosław Kaczmarek
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
