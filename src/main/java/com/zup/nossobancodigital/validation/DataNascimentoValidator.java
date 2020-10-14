package com.zup.nossobancodigital.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataNascimentoValidator implements ConstraintValidator<DataNascimentoValid, LocalDate> {

    private String value;

    @Override
    public void initialize(DataNascimentoValid constraintAnnotation) {
        this.value = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        if (localDate == null) {
            return true;
        }
        LocalDate hoje = LocalDate.now();
        return  ChronoUnit.YEARS.between(localDate, hoje) >= 18;
    }
}
