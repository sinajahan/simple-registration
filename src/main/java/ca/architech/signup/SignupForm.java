package ca.architech.signup;

import ca.architech.validator.NoDuplicateUserName;
import org.hibernate.validator.constraints.*;
import ca.architech.account.Account;

import javax.validation.constraints.Pattern;

public class SignupForm {

    private static final String USERNAME_MESSAGE = "{username.message}";
    private static final String USERNAME_UNIQUE_MESSAGE = "{username.unique.message}";
    private static final String USERNAME_LENGTH_MESSAGE = "{username.length.message}";
    private static final String PASSWORD_VALID_MESSAGE = "{password.valid.message}";

    @NoDuplicateUserName(message = SignupForm.USERNAME_UNIQUE_MESSAGE)
    @Length(min = 5, message = SignupForm.USERNAME_LENGTH_MESSAGE)
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = SignupForm.USERNAME_MESSAGE)
    private String username;

    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$", message = SignupForm.PASSWORD_VALID_MESSAGE)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account createAccount() {
        return new Account(getUsername(), getPassword());
    }
}
