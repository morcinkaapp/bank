package user;

/**
 * @author Przemysław Jambor
 */
public class UserEntity {

    private String login;
    private String password;

    public UserEntity() {

    }

    public UserEntity(UserEntityBuilder userEntityBuilder) {
        this.login = userEntityBuilder.login;
        this.password = userEntityBuilder.password;
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

    @Override
    public String toString() {
        return "UserEntity{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
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
