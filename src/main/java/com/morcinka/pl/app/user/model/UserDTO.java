package com.morcinka.pl.app.user.model;

/**
 * @author Jarosław Kaczmarek
 */
public class UserDTO {

    private String login;
    private String password;

    private UserDTO(UserDTOBuilder userDTOBuilder) {
        this.login = userDTOBuilder.login;
        this.password = userDTOBuilder.password;
    }

    public static UserDTOBuilder builder() {
        return new UserDTOBuilder();
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

        public UserDTOBuilder withLogin(String login) {
            this.login = login;
            return this;
        }

        public UserDTOBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }
    }

}
