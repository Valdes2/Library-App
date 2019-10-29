package mate.academy.spring.security;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import mate.academy.spring.annotation.PasswordMatching;
import mate.academy.spring.dto.UserDto;

public class PasswordMatchingValidator implements ConstraintValidator<PasswordMatching, Object> {
    @Override
    public void initialize(PasswordMatching constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        UserDto user = (UserDto) object;
        return user.getPassword().equals(user.getConfirmPassword());
    }
}
