package com.violet.controlller;

import com.alibaba.fastjson.JSON;
import com.violet.entity.User;
import com.violet.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

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
@RestController
@Slf4j
public class HelloController extends BeanController {

    @Resource
    private UserService userService;


    @GetMapping("/get")
    public List<User> hello(@NotEmpty int pageNum, @Min(value = 2) int pageSize) {
        log.info("pageNum:{},pageSize:{}", pageNum, pageSize);
        return userService.getUser(pageNum, pageSize);
    }

    @PostMapping("/insert")
    public String insert(@Valid User user, BindingResult result) {
        log.info("user:{}", JSON.toJSONString(user));
        String msg = validator(result);
        if (msg != null) {
            return msg;
        }
        return userService.insert(user) == 1 ? "SUCCESS" : "FAIL";
    }


}
