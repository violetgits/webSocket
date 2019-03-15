package com.violet.entity;

import com.violet.validator.FlagValidator;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 10:27
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Data
public class User implements Serializable {

    @NotEmpty
    private String userName;

    @NotEmpty
    private String password;

    @Email
    private String eMail;


    @FlagValidator(values = {1, 0})
    private int isValid;

    private static final long serialVersionUID = 1L;

}