package com.validation.customvalidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MyValidationConstraintValidator implements ConstraintValidator<MyValidation,String> {

    private String prefix;
    @Override
    public void initialize(MyValidation myValidation) {
        prefix = myValidation.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext context) {

        boolean result;

        if(code != null){
            result  = code.startsWith(prefix);
        }
        else{
            result = true;
        }
        return result;
    }
}
