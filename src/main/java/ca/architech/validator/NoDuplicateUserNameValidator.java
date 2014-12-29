package ca.architech.validator;

import ca.architech.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NoDuplicateUserNameValidator implements ConstraintValidator<NoDuplicateUserName, String> {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void initialize(NoDuplicateUserName username) {
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        if (username == null) {
            return false;
        }
        if (accountRepository.findByUsername(username) == null) {
            return true;
        } else {
            return false;
        }
    }
}
