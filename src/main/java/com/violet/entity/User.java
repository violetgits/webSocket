package com.violet.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 14:59
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -7551224865272674085L;

    private String userName;

    private String eMail;

    private String password;

}
