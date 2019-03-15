package com.violet.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-15 16:14
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Data
public class User implements Serializable {
    private String userName;

    private String password;

    private String eMail;

    private static final long serialVersionUID = 1L;
}