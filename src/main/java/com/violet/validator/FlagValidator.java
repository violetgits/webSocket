package com.violet.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-14 15:53
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = FlagValidatorClass.class)
public @interface FlagValidator {

    int[] values();

    String message() default "flag不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
