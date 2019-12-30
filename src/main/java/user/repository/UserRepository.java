package user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import user.UserEntity;

/**
 * @author Jarosław Kaczmarek
 */
public interface UserRepository extends JpaRepository<Long, UserEntity> {
}
