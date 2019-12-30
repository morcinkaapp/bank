package user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author Przemysław Jambor
 */
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String login;

    @NotNull
    private String password;

    public UserEntity() {
    }

    private UserEntity(UserEntityBuilder userEntityBuilder) {
        this.login = userEntityBuilder.login;
        this.password = userEntityBuilder.password;
    }

    public static UserEntityBuilder builder() {
        return new UserEntityBuilder();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class UserEntityBuilder {

        private String login;
        private String password;

        public UserEntityBuilder withLogin(String login) {
            this.login = login;
            return this;
        }

        public UserEntityBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserEntity build() {
            return new UserEntity(this);
        }
    }

}
