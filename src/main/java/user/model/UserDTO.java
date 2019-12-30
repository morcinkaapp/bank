package user.model;

/**
 * @author Jarosław Kaczmarek
 */
public class UserDTO {

    private String login;
    private String password;

    private UserDTO(UserDTO.UserDTOBuilder userEntityBuilder) {
        this.login = userEntityBuilder.login;
        this.password = userEntityBuilder.password;
    }

    public static UserDTO.UserDTOBuilder builder() {
        return new UserDTO.UserDTOBuilder();
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static class UserDTOBuilder {

        private String login;
        private String password;

        public UserDTO.UserDTOBuilder withLogin(String login) {
            this.login = login;
            return this;
        }

        public UserDTO.UserDTOBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }
    }

}
