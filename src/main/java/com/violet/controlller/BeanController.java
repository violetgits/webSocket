package com.violet.controlller;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import javax.annotation.Resource;
import java.util.List;
import java.util.Locale;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-14 15:08
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
class BeanController {

    @Resource
    private MessageSource messageSource;

    String validator(BindingResult result) {
        if (result.hasErrors()) {
            StringBuilder msg = new StringBuilder();
            //获取错误字段集合
            List<FieldError> fieldErrors = result.getFieldErrors();
            //获取本地locale,zh_CN
            Locale currentLocale = LocaleContextHolder.getLocale();
            fieldErrors.forEach(fieldError -> {
                //获取错误信息
                String errorMessage = messageSource.getMessage(fieldError, currentLocale);
                msg.append(fieldError.getField()).append("：").append(errorMessage).append(" , ");
            });
            //删除最后的逗号
            if (msg.length() > 0) {
                msg.deleteCharAt(msg.length() - 1);
            }
            return msg.toString();
        }
        return null;
    }
}
