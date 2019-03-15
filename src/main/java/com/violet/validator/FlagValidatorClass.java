package com.violet.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-14 15:56
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
public class FlagValidatorClass implements ConstraintValidator<FlagValidator, Integer> {

    private int[] flagValues;

    @Override
    public void initialize(FlagValidator flagValidator) {
        this.flagValues = flagValidator.values();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        boolean isFlag = false;
        for (int s : flagValues) {
            if (value == s) {
                isFlag = true;
                break;
            }
        }
        return isFlag;
    }


}


