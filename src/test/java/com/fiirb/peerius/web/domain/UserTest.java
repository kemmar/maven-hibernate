package com.fiirb.peerius.web.domain;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.junit.Assert.*;


public class UserTest {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void happyPath(){
        User user = new User();
        user.setFirstName("brian");
        user.setLastName("lewis");
        Set<ConstraintViolation<User>> test = validator.validate(user);

        assertEquals( 1, test.size() );
    }

    // Users first name cannot be less than three chars
    @Test
    public void firstNameLessThan3(){
        User user = new User();
        user.setFirstName("br");
        user.setLastName("lewis");
        Set<ConstraintViolation<User>> test = validator.validate(user);

        assertEquals( 1, test.size() );
    }

    // Users last name cannot be less than three chars
    @Test
    public void lastNameLessThan3(){
        User user = new User();
        user.setFirstName("brian");
        user.setLastName("le");
        Set<ConstraintViolation<User>> test = validator.validate(user);

        assertEquals( 1, test.size() );
    }

    // Users first name cannot be more than twenty chars
    @Test
    public void fistNameMoreThan20(){
        User user = new User();
        user.setFirstName("brian12345467890123456");
        user.setLastName("lewis");
        Set<ConstraintViolation<User>> test = validator.validate(user);

        assertEquals( 1, test.size() );
    }

    // Users last name cannot be more than twenty chars
    @Test
    public void lastNameMoreThan20(){
        User user = new User();
        user.setFirstName("brian");
        user.setLastName("lewis1234567890123456");
        Set<ConstraintViolation<User>> test = validator.validate(user);

        assertEquals( 1, test.size());
    }
}